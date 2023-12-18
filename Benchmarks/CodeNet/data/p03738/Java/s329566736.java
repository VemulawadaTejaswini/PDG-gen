import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1行、文字列
		String a = br.readLine();
		String b = br.readLine();

		String ans = "EQUAL";
		
		if(a.length() > b.length()) { System.out.println("GREATER"); return; }
		if(a.length() < b.length()) { System.out.println("LESS"); return; }

		
		for(int i=0; i<a.length(); i++) {
			if (a.charAt(i) > b.charAt(i)) { ans = "GREATER"; break;}
			if (a.charAt(i) < b.charAt(i)) { ans = "LESS"; break;}
		}
		
        System.out.println(ans);
        return;
    }


}

