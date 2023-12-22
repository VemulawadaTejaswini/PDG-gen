import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int[] num = new int[26];
			String y = sc.nextLine();
			String x = sc.nextLine();
			String[] s = x.split("[\\s]+");
			for(int i=0;i<n;i++){
				// vote
				num[(int)s[i].charAt(0)-(int)'A']++;
				
				// max search
				int max = 0;
				int now = 0;
				for(int j=0;j<26;j++){
					if(max<num[j]){
						max = num[j];
						now = j;
					}
				}

				// judge
				boolean judge = true;
				for(int j=0;j<26;j++){
					if(now == j){
						continue;
					}
					if(max<=num[j]+n-i-1){
						judge = false;
						break;
					}
				}

				// output
				if(judge){
					System.out.println(alphabet.charAt(now)+" "+(i+1));
					break;
				}
				else if(i==n-1){
					System.out.println("TIE");
				}
			}
		}
	}
}