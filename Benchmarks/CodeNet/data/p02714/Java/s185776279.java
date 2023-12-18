import java.util.Scanner;

// https://atcoder.jp/contests/abc162/tasks/abc162_d
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

//		String[] array = s.split("");

		int ans = 0;

//		int tmp = 0;
//		int tmp1 = 0;
//		for(int i=1;i<=n;i++) {
//			tmp = tmp + i;
//			tmp1 = tmp1 + tmp;
//		}
//		System.out.println(tmp1);

		for(int i =0;i<n;i++) {
		for(int j =i;j<n;j++) {
			for(int k =j;k<n;k++) {
				if((j-i!=k-j)&&(!(s.substring(i,i+1).equals(s.substring(j,j+1)))&&!(s.substring(j,j+1).equals(s.substring(k,k+1)))&&!(s.substring(i,i+1).equals(s.substring(k,k+1))))) {
					ans = ans + 1;
				}
			}
		}
	}

//		for(int i =0;i<n;i++) {
//			for(int j =i;j<n;j++) {
//				int k = 2*j-i;
//				if(k>=n) {
//
//				}else {
//					System.out.println(i+" "+j+" "+k);
//					if((!(array[i].equals(array[j]))&&!(array[j].equals(array[k]))&&!(array[i].equals(array[k])))) {
//						ans = ans + 1;
//					}
//				}
//			}
//		}

//		for(int i =0;i<n;i++) {
//			for(int j =i;j<n;j++) {
//				for(int k =j;k<n;k++) {
////					if((j-i!=k-j)&&(!(array[i].equals(array[j]))&&!(array[j].equals(array[k]))&&!(array[i].equals(array[k])))) {
//						ans = ans + 1;
////					}
//				}
//			}
//		}
		System.out.println(ans);
//		System.out.println(tmp1 - ans);

	}
}
