import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			boolean isPrime[] = new boolean[n+1];
			for(int i=0;i<=n;i++)
				isPrime[i]=true;
			isPrime[1]=false;
			for(int p=2;p<=n;p++)
				if(isPrime[p])
					for(int j=p+p;j<=n;j+=p)
						isPrime[j]=false;
			int cnt = 0;
			for(int i=2;i<=n;i++)
				if(isPrime[i])
					cnt++;
			System.out.println(cnt);
		}
	}
}