import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] buttons = new long[n];
		long[] mul = new long[n];
		for(int i=0;i<n;i++){
			buttons[i] = in.nextLong();
			mul[i] = in.nextLong();
		}
		long resevoir = 0;
		for(int i=mul.length-1;i>=0;i--){
			long add = (buttons[i]+resevoir)%mul[i]==0?(buttons[i]+resevoir)%mul[i]:mul[i] - (buttons[i]+resevoir)%mul[i];
			resevoir += add;
		}
		System.out.println(resevoir);
	}
	
    
}
