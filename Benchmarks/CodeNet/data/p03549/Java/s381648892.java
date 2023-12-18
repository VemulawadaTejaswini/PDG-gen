import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int Pow2 = 1;
		int ans = 0;
		for (int i = 0; i < M; i++) {
			Pow2*=2;
		}
		ans+=(N-M)*100;
		ans+=1900*M;
		ans*=Pow2;
		System.out.println(ans);
	}	
}