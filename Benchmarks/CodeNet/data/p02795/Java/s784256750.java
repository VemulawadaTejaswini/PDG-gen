import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int len = sc.nextInt();
        MyData[] d = new MyData[len];

		for (int i = 0; i < len; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
            d[i] = new MyData(a+b, a-b);
        }
		int ans = 0;
		int cur = -1000000000;
		for (int i = 0; i < len; i++) {
			if (d[i].getB() >= cur) {
				cur = d[i].getA();
				ans++;
            }
        }
		
//		for (int i = 0; i < len; i++) {
//			System.out.println(d[i].getB() + " " + d[i].getA());
  //      }
		System.out.println(ans);
    }
  
	public static class MyData implements Comparable<MyData> {
		int a, b;
		public MyData(int a, int b) {
			this.a = a;
            this.b = b;
        }
        public int compareTo(MyData other) {
            if (this.a == other.a) {
                return this.b - other.b;
            } else {
                return this.a - other.a;
            }
        }
        public int getA() {
            return this.a;
        }
        public int getB() {
            return this.b;
        }

    }
}