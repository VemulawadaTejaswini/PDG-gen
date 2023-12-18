import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()>=4 && s.substring(0,4).compareTo("YAKI") == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}

