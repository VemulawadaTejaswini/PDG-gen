
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ans =-1;
		int[] digits =new int[n];
		int[] s_array=new int[m];
		int[] c_array=new int[m];
		
		for (int i=0;i<m;i++) {
			s_array[i]=sc.nextInt();
			c_array[i]=sc.nextInt();
		}
		int start =0;
		if(n==2) {
			start=10;
		}
		if(n==3) {
			start =100;
		}
		for (int i=start;i<1000;i++) {
			int i_digit =i;
			for (int j=n-1;j>=0;j--) {
				digits[j]=i_digit%10;
				i_digit /= 10;
			}

			boolean isAns=true;

			for (int k=0;k<m;k++) {
				if (digits[s_array[k]-1]!=c_array[k]) {
					isAns =false;
				}
			}
			if (isAns) {
				ans=i;
				break;
			}
		}
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		System.out.println(ans);
	}
	//----------------------------------------
	//メソッド置き場

	//----------------------------------------
}