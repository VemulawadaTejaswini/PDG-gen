import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
    StringBuilder sb = new StringBuilder();
    PrintWriter pw = new PrintWriter(System.out);
	sb.append(S);
	int Q = sc.nextInt();
	int revCount =0;
	
	//命令実行部
	for(int i=0; i<Q; i++) {
		int T = Integer.parseInt(sc.next());
		if( T == 1)
			revCount++;
	    
	else {
	    int F = Integer.parseInt(sc.next());
	    char C = sc.next().charAt(0);
	    if (revCount%2 == 0 && F==1 || revCount%2==1 && F==2)
	    	sb.insert(0,C);
	    else
	    	sb.append(C);
		}
		
	}
	
		if ( revCount %2 == 1) 
			sb.reverse();
		
			System.out.println(sb);
			System.out.flush();

  }
}