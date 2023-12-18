import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] s = str.toCharArray();
		String sl = null,sr=null;
		for (int i=0;i<str.length();i++){
			if(i % 2==0){
				sl += s[i];
			}else{
				sr += s[i];
			}
		}
		if(sl.indexOf('L')!= -1 || sr.indexOf('R')!= -1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}	
	