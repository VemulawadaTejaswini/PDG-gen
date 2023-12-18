
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		double z = Math.log(y/x) / Math.log(2);
		System.out.println((long)Math.max(1, (int)z + 1));
	}
}
