import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	String s = sc.next();

    	String alp = "abcdefghijklmnopqrstuvwxyz";
    	String ans = "None";

    	for(int i = 0; i < alp.length(); i++){
    		for(int j = 0; j < s.length(); j++){
        		if (alp.charAt(i) != s.charAt(j)){
        			ans = String.valueOf(alp.charAt(i));
        			break;
        		}
    		}
    	}


    	// 出力
    	System.out.println(ans);
    }
}