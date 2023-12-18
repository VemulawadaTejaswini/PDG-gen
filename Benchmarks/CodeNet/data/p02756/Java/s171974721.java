import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
StringBuilder sb = new StringBuilder();
	sb.append(S);
	int Q = sc.nextInt();
	int revCount =0;
	
	//命令実行部
	for(int i=0; i<Q; i++) {
		int T = sc.nextInt();
		if( T == 1){
			revCount++;
			//反転していない状態
	} else if( revCount % 2 == 0) {
		    int F = sc.nextInt();
		    char C = sc.next().charAt(0);
			if ( F == 1) {
				sb.insert(0,C);	
				//末尾に追加
			} else {
				sb.append(C);
			}
			//反転してる状態
		} else {
		    int F = sc.nextInt();
		    char C = sc.next().charAt(0);
			if ( F == 1) {
				sb.append(C);
			} else{
				sb.insert(0,C);	
			}			
		}		
	}
	
		if ( revCount %2 == 0) {
			System.out.println(sb);
		}else {
			sb.reverse();
			System.out.println(sb);
			}	
  }
}