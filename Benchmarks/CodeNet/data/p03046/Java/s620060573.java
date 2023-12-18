import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int m = sc.nextInt();
		int k = sc.nextInt();
		m = 1 << m;
		sc.close();
	
		String ans = "";
		if(k>=m)
			ans = "-1";
		else if(k==0)
			for(int i=0;i<m;i++)
				ans += i + " ";
		else if(m==2)
			ans = "-1";
		else {
			ans += k;
			for(int i=0;i<m;i++)
				if(i!=k)
					ans = i+" "+ans+" "+i;
			ans = k+" "+ans;
		}
		System.out.print(ans);
	}
}