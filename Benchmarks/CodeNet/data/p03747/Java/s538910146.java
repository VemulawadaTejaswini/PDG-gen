import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int pair1=0;
	public static int pair2=0;
	public static double length=0;
	public static int l = 0;
	public static float h_l = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		l = Integer.parseInt(scan.next());
		h_l = l/2;
		Double t = Double.parseDouble(scan.next());
		List<Double> x = new ArrayList<Double>();
		List<Double> w = new ArrayList<Double>();
		for(int i=0; i<n; ++i) {
			x.add(Double.parseDouble(scan.next()));
			w.add(Double.parseDouble(scan.next()));
		}


		while(true) {
			length=l+1;
			double pairLength = length;
			// 向かい合う方向を向いていて一番近い物を探す
			for(int i=0; i<n; ++i) {
				//最初の場合は最後と比較
				if(i==n-1) {
					if(Math.abs(w.get(0) - w.get(n-1)) == 1) {
						//２点間の距離を求める
						double tempLength =0;
						if(w.get(i) == 1) tempLength = l - (x.get(n-1) - x.get(0));
						if(w.get(i) == 2) tempLength = x.get(n-1) - x.get(0);

						if(pairLength > tempLength && tempLength != 0) {
							pair1 = 0;
							pair2 = n-1;
							pairLength = tempLength;
						}
					}
				} else {
					if(Math.abs(w.get(i) - w.get(i+1)) == 1) {
						double tempLength =0;
						if(w.get(i) == 1) {
							double tempI_1 = x.get(i+1) - x.get(i);
							// ..0...<-X2....X1->..
							if(tempI_1 < 0) {
								tempLength = l + tempI_1;
							}
							// ..<-X2...0....X1->...
							else {
								tempLength = x.get(i+1) - x.get(i);
							}
						}
						if(w.get(i) == 2) tempLength = l - (x.get(i+1) - x.get(i));

						if(pairLength > tempLength && tempLength != 0) {
							pair1 = i;
							pair2 = i+1;
							pairLength = tempLength;
						}
					}
				}
			}

			System.out.println(pair1 + ":" + pair2);

			// みんな同じ方向を向いていたら、時間がくるまで進める
			if(pair1 ==0 && pair2 ==0) {
				update(x, w, t);
				break;
			}

			// 衝突する場合は、何秒後か求め衝突させ、向きを反転
			else {
				Double tempT = pairLength / 2;

				// 残り時間で衝突できない場合は最後まで更新
				if(tempT > t) {
					update(x, w, t);
					break;
				} else {
					update(x,w,tempT);
					t = t - tempT;

					if(w.get(pair1) == 1.0) {
						w.set(pair1, 2.0);
					} else {
						w.set(pair1, 1.0);
					}

					if(w.get(pair2) == 1.0) {
						w.set(pair2, 2.0);
					} else {
						w.set(pair2, 1.0);
					}
				}
			}

			length=l+1;
		}

		Iterator<Double> itr = x.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void update(List<Double> x, List<Double> w, Double t) {
		for(int i = 0; i< x.size(); ++i) {
			t = t % l;
			if(w.get(i) == 1) {
				Double tempX = x.get(i) + t;
				if(tempX < l) { x.set(i, tempX);}
				else { x.set(i, tempX -l);}
			} else {
				Double tempX = x.get(i) - t;
				if(tempX >= 0) {x.set(i, tempX);}
				else {x.set(i, l + tempX);}//0を超えたぶん
			}
		}
	}
}
