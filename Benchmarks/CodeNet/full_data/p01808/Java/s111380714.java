import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.io.*;

/**
 * AIZU ONLINE JUDGE
 * 2705 Kuru Kuru Door
 *    2018/02/11
 */
public class Main {

    class Graphics2D {
        void draw(Shape s) {
        }
        void setColor(Color c) {
        }
    }

    static class Double2 {

        public double x, y;

        public Double2() {/**/}
        public Double2( double xx, double yy ) { x=xx; y=yy; }
        public Double2( Double2 s ) { x=s.x; y=s.y; }

        @Override
        public String toString() {
            return String.format("[%g %g]", x, y);
        }

        // 極座標から構築
        public static Double2 createFromPolar(double r, double theta) {
            return new Double2(r * Math.cos(theta), r* Math.sin(theta));
        }

        public double length2() {
            return x*x + y*y;
        }

        public double length() {
            return Math.sqrt(x * x + y * y);
        }
        public double length2(Double2 d2) {
            return (d2.x - x) * (d2.x - x) + (d2.y - y) * (d2.y - y);
        }
        public double length(Double2 d2) {
            return Math.sqrt((d2.x - x) * (d2.x - x) + (d2.y - y) * (d2.y - y));
        }
        public double atan2() {
            return Math.atan2(y, x);
        }
        public double atan2(Double2 d2) {
            return Math.atan2(d2.y - y, d2.x - x);
        }

        public Double2 add(Double2 d) {
            x += d.x;
            y += d.y;
            return this;
        }
        public Double2 sub(Double2 d) {
            x -= d.x;
            y -= d.y;
            return this;
        }

        // 自分を反転する
        public void inv() {
            x = -x;
            y = -y;
        }
    }

    // 線分d1-d2 と d0
    double lenld(Double2 d0, Double2 d1, Double2 d2) {
        double a = d2.x - d1.x;
        double b = d2.y - d1.y;
        double a2 = a * a;
        double b2 = b * b;
        double r2 = a2 + b2;
//        double tt = -(a*(d1.x-d0.x)+b*(d1.y-d0.y));
//        if( tt < 0 ) {
//          return (x1-x0)*(x1-x0) + (y1-y0)*(y1-y0);
//        }
//        if( tt > r2 ) {
//          return (x2-x0)*(x2-x0) + (y2-y0)*(y2-y0);
//        }
        double f1 = a*(d1.y-d0.y)-b*(d1.x-d0.x);
        return Math.sqrt((f1*f1)/r2);
    }


    // ang正規化 -Math.PI <= th <= Math.PI
    static double angNorm(double th) {
        if (th > Math.PI) {
            int k = (int)Math.floor((th + Math.PI) / (Math.PI * 2));
            th -= k * (Math.PI * 2);
        }
        if (th < -Math.PI) {
            int k = (int)Math.floor((-th + Math.PI) / (Math.PI * 2));
            th += k * (Math.PI * 2);
        }
        return th;
    }

    // 片側
    class Kata {
        int n;
        int f;
        double r;
        double R;
        Double2 S;
        Double2 S1;
        Double2 S2;
        Double2 D1;
        Double2 D2;
        Double2 A1;
        Double2 A2;
        double ang_S1;
        double ang_S2;
        double ang_A1;
        double ang_A2;
        double ang_D1;
        double ang_D2;
        double ang_C1;
        boolean existS1; // A側
        boolean existS2; // D側
        boolean existD;
        boolean existA;

        double[] getLength() {
            double total = 0;
            Double2 t = S;
            if (existD) {
                if (existS2) {
                    total += S.length(S2);
                    total += angNorm(ang_S2 - ang_D1) * f * (R + r);
                }
                else {
                    total += S.length(D1);
                }
                total += angNorm(ang_D1 - ang_D2) * f * r;
                t = D2;
            }
            if (existA) {
                if (existS1) {
                    total += S.length(S1);
                    total += angNorm(ang_A1 - ang_S1) * f * (R + r);
                }
                else {
                    total += t.length(A1);
                }
                total += angNorm(ang_A2 - ang_A1) * f * r;
                t = A2;
            }
            return new double[] { total, t.x, t.y };
        }

        // 片側計算 f = 1 or -1
        void kata(Graphics2D g, int n, double r, double R, Double2 S, int f) {

            this.n = n;
            this.r = r;
            this.R = R;
            this.S = S;
            this.f = f;
            double r_c = r / Math.sin(Math.PI / n / 2);

            double ang_A;
            double ang_D;
            Double2 A;
            Double2 D;

            ang_A = Math.PI - Math.PI / 2 / n;
            A = Double2.createFromPolar(R, ang_A);
            ang_D = Math.PI + Math.PI / 2 / n;
            D = Double2.createFromPolar(R, ang_D);
            if (f < 0) {
                ang_A = Math.PI / 2 / n;
                A = Double2.createFromPolar(R, ang_A);
                ang_D = - Math.PI / 2 / n;
                D = Double2.createFromPolar(R, ang_D);
            }

            // S2 D側の回転ドアの外側
            ang_S2 = S.atan2() - Math.acos((R + r) / S.length()) * f;
            ang_D1 = D.atan2();
            if (S.y < 0 && angNorm(ang_S2 - ang_D1) * f > 0) {
                // S2あり
                existS2 = true;
                S2 = Double2.createFromPolar(R + r, ang_S2);
                g.draw(new Ellipse2D.Double(S2.x - r, S2.y - r, r * 2 , r * 2));
            }
            else {
                // S2なし
                // S-D
                double ang_DS = D.atan2(S);
                ang_D1 = ang_DS - Math.acos(r / D.length(S)) * f;
            }

            // D-C
            ang_D2 = D.atan2() - Math.acos((r_c - r) / A.length()) * f;
            if (angNorm(ang_D1 - ang_D2) * f < 0) {
                // Dなし
            }
            else {
                // Dあり
                existD = true;
                D1 = Double2.createFromPolar(r, ang_D1); D1.add(D);
                g.setColor(Color.BLUE);
                g.draw(new Ellipse2D.Double(D1.x - r, D1.y - r, r * 2 , r * 2));
                D2 = Double2.createFromPolar(r, ang_D2); D2.add(D);
                g.setColor(Color.RED);
                g.draw(new Ellipse2D.Double(D2.x - r, D2.y - r, r * 2 , r * 2));
            }

            // S1 A側の回転ドアの外側
            ang_S1 = S.atan2() + Math.acos((R + r) / S.length()) * f;
            ang_A1 = A.atan2();
            if (!existD && angNorm(ang_A1 - ang_S1) * f > 0) {
                // S1あり
                existS1 = true;
                S1 = Double2.createFromPolar(R + r, ang_S1);
                //g.setColor(Color.YELLOW);
                g.draw(new Ellipse2D.Double(S1.x -r, S1.y - r, r * 2 , r * 2));
            }
            else {
                // S1なし
                if (existD) {
                    // D-A
                    ang_A1 = ang_D2 - Math.PI;
                }
                else {
                    // S-A
                    double ang_AS = A.atan2(S);
                    ang_A1 = ang_AS + Math.acos(r / A.length(S)) * f;
                }
            }

            // A-C
            ang_A2 = A.atan2() + Math.PI - Math.acos((r_c + r) / A.length()) * f;
            if (angNorm(ang_A2 - ang_A1) * f < 0) {
                // Aなし
                if (existD) {
                    // Dあり
                    ang_C1 = ang_D2;
                }
                else {
                    ang_C1 = S.atan2() - Math.acos(r_c / S.length()) * f;
                }
            }
            else {
                // Aあり
                existA = true;
                ang_C1 = ang_A2 + Math.PI;
            }
        }
    }


    double calc(int n, double r, double R, Double2 S, Double2 T, int ff) {
        Graphics2D g = new Graphics2D();

        double total = 0;
        double r_c = r / Math.sin(Math.PI / n / 2);

        if (r_c + r > R) {
            total = -1; // 到達不能
        }
        else {
            double ang_A = Math.PI - Math.PI / 2 / n;
            Double2 A = Double2.createFromPolar(R, ang_A);
            double ang_D = Math.PI + Math.PI / 2 / n;
            Double2 D = Double2.createFromPolar(R, ang_D);
            double ang_B = - Math.PI / 2 / n;
            Double2 B = Double2.createFromPolar(R, ang_B);
            double ang_E = Math.PI / 2 / n;
            Double2 E = Double2.createFromPolar(R, ang_E);

            Kata k0 = new Kata();
            Kata k1 = new Kata();
            k0.kata(g, n, r, R, S, 1);
            k1.kata(g, n, r, R, T, -1);

            Double2 C1 = null;
            Double2 C2 = null;

            if (angNorm(k0.ang_C1 - k1.ang_C1) < 0) {
                // Cなし

                boolean mod = false;
                for(int i = 0; i < 10; i++) {
                    mod = false;
                    log.printf("i = %d\n", i);
                if (k1.existA) {
                    k0.ang_A2 = -Math.PI / 2;
                }
                else {
                    Double2 t = new Double2(T);
                    t.sub(A);
                    k0.ang_A2 = t.atan2() - Math.acos(r / t.length());
                }
                boolean e = (angNorm(k0.ang_A2 - k0.ang_A1) > 0);
                if (e != k0.existA) {
                    mod = true;
                    k0.existA = e;
                }

                if (k0.existA) {
                    k1.ang_A2 = -Math.PI / 2;
                }
                else {
                    Double2 t = new Double2(S);
                    t.sub(E);
                    k1.ang_A2 = t.atan2() + Math.acos(r / t.length());
                }
                e = (angNorm(k1.ang_A2 - k1.ang_A1)*-1 > 0);
                if (e != k1.existA) {
                    mod = true;
                    k1.existA = e;
                }
                if (!mod)
                    break;
                }
            }
            else {
                // Cあり
                C1 = Double2.createFromPolar(r_c, k0.ang_C1);
                g.setColor(Color.BLUE);
                g.draw(new Ellipse2D.Double(C1.x -r, C1.y - r, r * 2 , r * 2));
                C2 = Double2.createFromPolar(r_c, k1.ang_C1);
                g.setColor(Color.RED);
                g.draw(new Ellipse2D.Double(C2.x -r, C2.y - r, r * 2 , r * 2));
            }

            if (k0.existA) {
                k0.A1 = Double2.createFromPolar(r, k0.ang_A1); k0.A1.add(A);
                g.setColor(Color.BLUE);
                g.draw(new Ellipse2D.Double(k0.A1.x -r, k0.A1.y - r, r * 2 , r * 2));
                k0.A2 = Double2.createFromPolar(r, k0.ang_A2); k0.A2.add(A);
                g.setColor(Color.RED);
                g.draw(new Ellipse2D.Double(k0.A2.x -r, k0.A2.y - r, r * 2 , r * 2));
            }
            if (k1.existA) {
                k1.A1 = Double2.createFromPolar(r, k1.ang_A1); k1.A1.add(E);
                g.setColor(Color.BLUE);
                g.draw(new Ellipse2D.Double(k1.A1.x -r, k1.A1.y - r, r * 2 , r * 2));
                k1.A2 = Double2.createFromPolar(r, k1.ang_A2); k1.A2.add(E);
                g.setColor(Color.RED);
                g.draw(new Ellipse2D.Double(k1.A2.x -r, k1.A2.y - r, r * 2 , r * 2));
            }

            double[] ret0 = k0.getLength();
            double[] ret1 = k1.getLength();
            total += ret0[0];
            total += ret1[0];
            if (C1 != null) {
                total += new Double2(ret0[1], ret0[2]).length(C1);
                total += new Double2(ret1[1], ret1[2]).length(C2);
                total += angNorm(k0.ang_C1 - k1.ang_C1) * r_c;
            }
            else {
                total += new Double2(ret0[1], ret0[2]).length(new Double2(ret1[1], ret1[2]));
            }

//            total = 0;
////            total += S.length(D1);
////            System.out.printf("@@@ S-D1 %f\n", S.length(D1));
////            total += angNorm(ang_D1 - ang_D2) * r;
//            //total += D1.length(D2);
////            System.out.printf("@@@ D1-D2 %f\n", angNorm(ang_D1 - ang_D2) * r);
////            System.out.printf("@@@ D1-D2 s %f\n", D1.length(D2));
////            total += D2.length(A1);
////            System.out.printf("@@@ D2-A1 %f\n", D2.length(A1));
////            total += angNorm(ang_A2 - ang_D2+Math.PI/*ang_AA1*/) * r;
////            System.out.printf("@@@ A1-A2 %f\n", angNorm(ang_A2 - ang_D2+Math.PI/*ang_AA1*/) * r);
////            System.out.printf("@@@ A1-A2 s %f\n", A1.length(A2));
////            total += A2.length(C1);
////            System.out.printf("@@@ A2-C1 %f\n", A2.length(C1));
////            total += angNorm(ang_C1 - ang_C2) * r_c;
////            System.out.printf("@@@ C1-C2 %f\n", angNorm(ang_C1 - ang_C2) * r_c);
//
//            total += T.length(E1);
//            System.out.printf("@@@ T-E1 %f\n", T.length(E1));
//            total += angNorm(ang_E1 - ang_E2) * r;
//            //total += E1.length(E2);
//            System.out.printf("@@@ E1-E2 %f\n", angNorm(ang_E1 - ang_E2) * r);
//            System.out.printf("@@@ E1-E2 s %f\n", E1.length(E2));
//            total += E2.length(C2);
//            System.out.printf("@@@ E2-C2 %f\n", E2.length(C2));
//            System.out.printf("@@@total = %f\n", total);
//}
        }

        log.printf("total = %f\n", total);
        return total;
    }

	boolean main() throws IOException {

//	    double l = lenld(new Double2(3, 3), new Double2(0,0), new Double2(10,10));
//	    System.out.printf("len %f\n", l);

		int[] ir = readIntArray();
		int n = ir[0];
		if (n == 0)
		    return false;

        ir = readIntArray();
        int r = ir[0];
        int R = ir[1];
        ir = readIntArray();
        Double2 S = new Double2(ir[0], ir[1]);
        ir = readIntArray();
        Double2 T = new Double2(ir[0], ir[1]);

		log.printf("n = %d\n", n);
        log.printf("r, R = %d, %d\n", r, R);
        log.printf("S = %s\n", S);
        log.printf("T = %s\n", T);

        double r_c = r / Math.sin(Math.PI / n / 2);
        log.printf("r_c = %f\n",  r_c); // OからCの中心までの距離

        double total = 0;

        if (r_c + r > R) {
            total = -1; // 到達不能
            result.printf("%f\n", total);
        }
        else {
            double total0 = calc(n, r, R, S, T, 0);

            // y方向反転
            double total1 = calc(n, r, R, new Double2(S.x, -S.y), new Double2(T.x, -T.y), 1);
            log.printf("total0 = %f total1 = %f\n",  total0, total1);
            total = Math.min(total0, total1);
            //result.printf("%f  %f %f\n", total, total0, total1);
            result.printf("%f", total);
        }
		return true; // 正常終了 次へ
	}



	static long time0;

    PrintStream log;
    PrintStream result;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        result = System.out;
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

	public static void main(String[] args) throws IOException {

		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = instance.main();
			if (!b)
				break;
		}

        instance.systemin.close();
	}

	// 標準入力より1行分の区切り文字区切りでの整数値を読む
	// EOFの場合はnullを返す
	private int[] readIntArray() throws IOException {

		String s = null;
		for(;;) {
			s = systemin.readLine();
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // 突然空行を読むことがある。読み飛ばすとうまくいくらしい
				break;
		}

		String[] sp = s.split("[ ,]"); // 区切り文字はスペースかカンマ
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}

}


