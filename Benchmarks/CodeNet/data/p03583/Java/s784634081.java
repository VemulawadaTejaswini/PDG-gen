
import java.util.Scanner;

public class Main {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		
		int ans1= 0;
		int ans2 = 0;
		int ans3 = 0;
		
	for(int i = 1 ; i <= 3500 ; i++) {
		for(int j = 1 ; j <= 3500 ; j++) {
			long temp = (long)i * j * n;
			long temp1 = (long)(4 * i * j) - n * (i + j);
			if(temp1 <= 0) continue;
			if(temp % temp1 == 0 ) {
				ans1 = i;
				ans2 = j ;
				ans3 = (int)(temp/temp1);
			}
		}
	}
		System.out.println(ans1+" "+ans2+" "+ans3);
		
		}	
	}

