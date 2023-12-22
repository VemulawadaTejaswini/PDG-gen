import java.util.Scanner;
public class Main { 
	public static void main(String[] args){
		int a=0;
		int b=0;
		int ans=0;
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int count=0;
			int n = sc.nextInt();
			for (int i = 0;i<=n;i++) {
				a = n*n -2*n +2;
				b = a % 3650;
				count ++;
				if(b==0) ans=count+1;
				if(b!=0) ans=count;
		
			}
			System.out.println(ans);
		}
	}
}
