import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int[] sticks;
	public static int[] maps=new int[2001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sticks=new int[N];
		for(int i=0;i<N;i++) {
			sticks[i]=sc.nextInt();
		}
		
		Arrays.sort(sticks);
		long ans=0;
		
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				for(int l=j+1;l<N;l++) {
					if(sticks[i]+sticks[j]<=sticks[l])
						break;
					
					ans++;
				}
			}
		}
		
		System.out.println(ans);
	}

}