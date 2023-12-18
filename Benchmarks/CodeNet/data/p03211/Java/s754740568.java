import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	String s = sc.next();
    	int s_ans =999;
    	int s_konkai;
    	int l = s.length() - 2;

    	for(int i = 0; i < l; i++){

    		s_konkai =Integer.parseInt(s.substring(i,i+3));
    		if(Math.abs(753 - s_konkai) < s_ans){
    			s_ans = s_konkai;
    		}
    	}

    	// 出力
    	System.out.println(s_ans);
    }
}