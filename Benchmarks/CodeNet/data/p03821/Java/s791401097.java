import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] buttons = new int[n];
		int[] mul = new int[n];
		for(int i=0;i<n;i++){
			buttons[i] = in.nextInt();
			mul[i] = in.nextInt();
		}
		int resevoir = 0;
		for(int i=mul.length-1;i>=0;i--){
			int add = (buttons[i]+resevoir)%mul[i]==0?(buttons[i]+resevoir)%mul[i]:mul[i] - (buttons[i]+resevoir)%mul[i];
			resevoir += add;
		}
		System.out.println(resevoir);
	}
	
    
}
