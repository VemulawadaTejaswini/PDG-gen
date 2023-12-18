
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] judge = new boolean[55556];
		Arrays.fill(judge, true);
		judge[0] = false;
		judge[1] = false;
		int count = 0;
		for(int i=2;i<55556;i++){
			if(judge[i]){
				System.out.print(i);
				count++;
				if(count==n){
					System.out.println();
					break;
				}
				else{
					System.out.print(" ");
				}
				for(int j=i*2;j<55556;j+=i){
					judge[j] = false;
				}
			}
		}
	}
}
