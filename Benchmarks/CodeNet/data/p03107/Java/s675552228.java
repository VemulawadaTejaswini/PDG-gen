import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	String s = sc.next();

    	//int len = s.length();

    	for(int i = 0; i < s.length(); i++){
        	if(s.indexOf("10") != -1){
            	s = s.replace("10", "");
        	} else if(s.indexOf("01") != -1){
        		s = s.replace("01", "");
        	} else {
        		break;
        	}
    	}

    	// 出力
    	System.out.println(s.length());
    }
}