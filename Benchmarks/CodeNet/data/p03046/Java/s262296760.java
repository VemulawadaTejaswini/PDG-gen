import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int m = sc.nextInt();
		int k = sc.nextInt();
		m = 1 << m;
		sc.close();
	
		StringBuilder ans = new StringBuilder(m << 2);
		if(k>=m)
			ans.append(-1);
		else if(k==0)
			for(int i=0;i<m;i++)
				ans.append(i).append(" ").append(i).append(" ");
		else if(m==2)
			ans.append(-1);
		else {
			ans.append(k);
			for(int i=0;i<m;i++)
				if(i!=k)
					ans.insert(0," ").insert(0,i).append(" ").append(i);
			ans.insert(0," ").insert(0,k);
		}
		System.out.print(ans.toString());
	}
}