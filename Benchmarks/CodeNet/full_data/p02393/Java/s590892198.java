import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i=0;i<3;i++){
			a[i] = sc.nextInt();
		}		
		Arrays.sort(a);
		for(int i=0;i<3;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

