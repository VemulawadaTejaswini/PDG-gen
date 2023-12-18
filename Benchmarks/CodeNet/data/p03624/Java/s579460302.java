import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	String s = sc.next();

    	String alp = "abcdefghijklmnopqrstuvwxyz";
    	String ans = "";



    	for(int i = 0; i < alp.length(); i++){
			String tmp = "";

    		for(int j = 0; j < s.length(); j++){
        		if (alp.charAt(i) == s.charAt(j)){
        			tmp = "ng";
        			//System.out.println(alp.charAt(i));
        			//System.out.println(s.charAt(j));

        		}
    		}
    		if (!(tmp.equals("ng"))){
        		ans = String.valueOf(alp.charAt(i));
        		break;
    		}

    	}

		if (ans.equals("")){
			ans = "None";
		}

    	// 出力
    	System.out.println(ans);
    }
}