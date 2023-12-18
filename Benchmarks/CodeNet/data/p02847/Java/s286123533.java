import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		// 文字列の入力
      int a[] = new int[3];
        for(int i=0;i<3;i++){
          a[i]=Integer.parseInt(sc.next());
        }
		int k=0;
		int ans=0;
 
		for(int i=1;i<=1000000000;i++) {
			for(int j=1;j<=9;j++) {
				if(i/Math.pow(10, j)==0) {
					k = j;
					break;
				}
			}
			int cost = a[0]*i+a[1]*k;
			if(a[2]>=cost) {
				ans=i;
			}
		}
		System.out.println(ans);
 
	}
}