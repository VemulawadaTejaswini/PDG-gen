import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	String S = sc.next();	
      	String W = sc.next();
		if(Integer.toHexString(S.getBytes())>Integer.toHexString(W.getBytes())){
        	System.out.println(">");
        }else if(Integer.toHexString(S.getBytes())==Integer.toHexString(W.getBytes())){
			System.out.println("=");
        }else if(Integer.toHexString(S.getBytes())<Integer.toHexString(W.getBytes())){
        	System.out.println("<");
        }
        }
}
