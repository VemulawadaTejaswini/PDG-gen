import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int L=sc.nextInt();
	int R=sc.nextInt();
	sc.close();
	int ans=2018;
	Loop:for(int i=L;i<R;i++) {
		for(int j=L+1;j<=R;j++) {
			ans=Math.min(ans, i*j%2019);
			if(ans==0)
				break Loop;

		}
	}
	System.out.println(ans);
}
}

