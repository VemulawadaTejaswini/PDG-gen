import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		Y = Y/1000;
		int man = -1;
		int gosen = -1;
		int sen = -1;
		boolean flg = true;
		for(int i=0;i<=N;i++){
			if(!flg){
				break;
			}
			for(int j=0;j<=N-i;j++){
				if(Y== i*10+j*5+(N-i-j)){
					man = i;
					gosen = j;
					sen = N-i-j;
					flg = false;
					break;
				}
			}
		}
		out.println(man+" "+gosen+" "+sen);
		out.flush();	
	}
}