import java.util.*;
import java.io.*;

public class Main{

	
	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int ans = 0;

		if(N > 1){
			for(int i = 1;i < N;i++){
				ans += i;
			}
		}

		System.out.println(ans);
	}
}