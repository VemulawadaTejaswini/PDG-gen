import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){

	Scanner stdIn = new Scanner(System.in);
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	int n = stdIn.nextInt();
	int m = stdIn.nextInt();

	int[] lpoint = new int[m];
	int[] rpoint = new int[m];

	int ans = 1;
	for(int i = 0;i < m;i++){
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		if(i > 0){
			for(int j = 0;j < i;j++){
				if(rpoint[j] < a || lpoint[j] > b){
					ans++;
					break;
				}
			}
		}
			
		lpoint[i] = a;
		rpoint[i] = b;
	}
	System.out.println(ans);
		
	}
}