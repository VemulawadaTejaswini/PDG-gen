import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
      	String A = sc.next();
      	String B = sc.next();
      	String C = sc.next();
      	StringBuffer chA =new StringBuffer(A);
      	StringBuffer chB =new StringBuffer(B);
      	StringBuffer chC =new StringBuffer(C);
		int cnt = 0;
      	for(int i=0;i<N;i++){
        	if(chA.charAt(i) == chB.charAt(i) && chB.charAt(i) == chC.charAt(i)){
            	cnt += 0;
            }else if(chA.charAt(i) == chB.charAt(i) ||
                     chB.charAt(i) == chC.charAt(i) ||
                     chC.charAt(i) == chA.charAt(i)){
              	cnt += 1;
            }else{
            	cnt += 2;
            }
        }
        System.out.println(cnt);
    }
}