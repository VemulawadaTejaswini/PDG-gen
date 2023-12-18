import java.util.*;

public class Main {

	public static void main(String[] args){
    		Scanner in = new Scanner(System.in);
    		
    		String[] s = in.next().split("");
    		String answer = "";
    		for (int x = 0; x < 4; x++){
    			answer += s[x];
    		}
    		answer += " ";
    		for (int x = 4; x < s.length; x++){
    			answer += s[x];
    		}
    		System.out.println(answer);
    		in.close();
    }
}