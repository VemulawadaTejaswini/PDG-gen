import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int ans = 1;
		while(true){
			if(a<=0 || c<=0){
				break;
			}
			c -= b;
			if(a<=0 || c<=0){
				break;
			}
			a -= d;
		}
		if(a<=0){
			System.out.println("No");
		}else if(c<=0){
			System.out.println("Yes");
		}
	}
}