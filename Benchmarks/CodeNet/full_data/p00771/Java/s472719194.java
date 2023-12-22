import java.util.Scanner;

public class Main {
    static int n;
    static int[][] rope = new int[10][3];
    static int[][] acute = new int[10][10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            n = sc.nextInt();
            if(n==0) break;

            for (int i = 0; i < n; i++) {
                rope[i][0] = sc.nextInt();
                rope[i][1] = sc.nextInt();
                rope[i][2] = sc.nextInt();
            }

           System.out.println(maxHeight());
        }
    }

    static double maxHeight() {
        double max = 0;

        for (int i = 0; i < n; i++) {
            if(check((double)rope[i][0], (double)rope[i][1], (double)rope[i][2])){
                max = Math.max(rope[i][2], max);
            }
        }

        if (n>=2){
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    max = Math.max(max, height1(i, j));
                }
            }
        }

        if (n>=3){
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        max = Math.max(max, height2(i, j, k));
                    }
                }
            }
        }

        return max;
    }

    static boolean check(double x, double y, double z) {
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if(distance(i, x, y, z)-rope[i][2]*rope[i][2]>0.000000001) ok = false;
        }
        return ok;
    }

    static double distance(int i, double x, double y, double z) {
        return (rope[i][0]-x)*(rope[i][0]-x)+(rope[i][1]-y)*(rope[i][1]-y)+z*z;
    }

    static double height1(int i, int j){
        double a = Math.sqrt((rope[i][0]-rope[j][0])*(rope[i][0]-rope[j][0])
                                +(rope[i][1]-rope[j][1])*(rope[i][1]-rope[j][1]));
        if((rope[i][2]+rope[j][2])-a>0 && (rope[i][2]+a)-rope[j][2]>0 && (a+rope[j][2])-rope[i][2]>0){
            double d = (rope[i][2]*rope[i][2]+a*a-rope[j][2]*rope[j][2])/(2*a);
            double x = (d/a)*rope[j][0]+((a-d)/a)*rope[i][0];
            double y = (d/a)*rope[j][1]+((a-d)/a)*rope[i][1];
            double z = Math.sqrt(rope[i][2]*rope[i][2]-d*d);
            if (check(x, y, z)){
                return z;
            }
        }
        return 0;
    }

    static double height2(int i, int j, int k) {
        double a1 = 2*(rope[j][0]-rope[i][0]), a2 = 2*(rope[k][0]-rope[i][0]);
        double b1 = 2*(rope[j][1]-rope[i][1]), b2 = 2*(rope[k][1]-rope[i][1]);
        double e1 = rope[i][2]*rope[i][2]-rope[j][2]*rope[j][2]
                    -(rope[i][0]+rope[j][0])*(rope[i][0]-rope[j][0])
                    -(rope[i][1]+rope[j][1])*(rope[i][1]-rope[j][1]),
                e2 = rope[i][2]*rope[i][2]-rope[k][2]*rope[k][2]
                    -(rope[i][0]+rope[k][0])*(rope[i][0]-rope[k][0])
                    -(rope[i][1]+rope[k][1])*(rope[i][1]-rope[k][1]);
        if (a1*b2-b1*a2!=0 && a1*b2-a2*b1!=0) {
            double x = (e1 * b2 - b1 * e2) / (a1 * b2 - b1 * a2);
            double y = (e2 * a1 - e1 * a2) / (a1 * b2 - a2 * b1);
            double z = rope[i][2] * rope[i][2] - (x - rope[i][0]) * (x - rope[i][0])
                                                - (y - rope[i][1]) * (y - rope[i][1]);
            if (z>0) {
                z = Math.sqrt(z);
                if (check(x, y, z)) return z;
            }
        }
        return 0;
    }
}