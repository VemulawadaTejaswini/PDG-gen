import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args)throws IOException{
    //BufferedReader br = new BufferedReader(System.in);
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    
    int N = sc.nextInt();
		String S = sc.next();
		int BLACK = 0;
		int WHITE = 0;
		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='.') {
				WHITE++;
			}
		}
		int min = WHITE;
		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='#') {
				BLACK++;
			}
			else {
				WHITE--;
			}
 
			min = Math.min(min, WHITE + BLACK);
		}
		System.out.println(min);
    
    out.flush();
  }
}