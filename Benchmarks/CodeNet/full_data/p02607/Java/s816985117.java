import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ctr = 0;
		for(int i=0;i<n;i++)
		{
			int c = s.nextInt();
			if((i+1)%2!=0 && c%2!=0) {
				ctr++;
			}
		
		}
		System.out.println(ctr);
		
	}

}