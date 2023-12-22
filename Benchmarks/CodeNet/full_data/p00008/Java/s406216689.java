import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		int f=0;
		int n=scan.nextInt();
		for(int i=9;i>=0;i--){
			for(int j=9;j>=0;j--){
				for(int k=9;k>=0;k--){
					int t=n;
					t=t-i-j-k;
					if(t>=0&&t<10){
						f++;
					}
				}
			}
		}
		System.out.println(f);
	}

}