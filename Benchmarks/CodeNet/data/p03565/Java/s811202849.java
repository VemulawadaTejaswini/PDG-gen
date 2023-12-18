import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
		String s = sc.nextLine();
        String t = sc.nextLine();
        int n = s.length();
        sc.close();
        List<String> anses = new ArrayList<>();
        for(int i = 0; i + t.length() <= n; i++){
            String temp = "";
            for(int j = 0; j < n; j++){
                if(i <= j && j < i + t.length()){
                    if(s.charAt(j) == '?' || s.charAt(j) == t.charAt(j-i)) temp += t.charAt(j-i);
                    else break; 
                }else{
                    if(s.charAt(j) == '?') temp += 'a';
                    else temp += s.charAt(j);
                }
            }
            if(temp.length() == n) anses.add(temp);
        }

        Collections.sort(anses);
        
        if(anses.isEmpty()) out.println("UNRESTORABLE");
        else out.println(anses.get(0));
        out.flush();
	}
}