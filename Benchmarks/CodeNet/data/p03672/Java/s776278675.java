import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]){
 
    	//B問題
    	Scanner scan = new Scanner(System.in);
 
    	//文字列格納用
    	String S;
    	S = scan.next();
 
 
 
    	while(S.length() >= 2){
        	//1文字削除
        	if(S != null && S.length() > 0){
        	    S = S.substring(0, S.length()-1);
        	}
        	//文字数が偶数ならば
        	if(S.length() % 2 == 0){
        		String sa = S.substring(0,S.length() / 2);
        		String sb = S.substring(S.length() / 2 ,S.length());
        		if(sa.equals(sb)){
        			System.out.println(S.length());
        			break;
        		}
        	}
    	}