import java.util.*;
import java.io.*;

public class Main{

	
	public static void main(String[] args){
	
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		double ans = 0;

		if(N % 2 == 0){
			ans = 1.0 / 2.0;
		}
		else{
			ans = (N / 2 + 1) / (double)N;
		}

		System.out.println(ans);
	}
}