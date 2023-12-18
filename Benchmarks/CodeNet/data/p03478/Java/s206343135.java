import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int A = sc.nextInt(); 
		int B = sc.nextInt();
		String s; int sum; int ans=0;
		
		for(int i=1;i<=N;i++) 
		{
			s 	= String.valueOf(i);
			sum	= 0;
			for(int k=0; k < s.length() ; k++) 
				sum += Integer.parseInt( s.substring(k,k+1) );
			if(A <= sum &&sum <= B)	ans += Integer.parseInt(s);
		}
		System.out.println(ans);
	}
	
		
}
