import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int count = 0;
		String s = sc.next();
        String sa[];
        sa = new String[s.length()];
        String c = "CODEFESTIVAL2016";
        String ca[];
        ca = new String[c.length()];
        for(int i=0; i<c.length(); i++){
            if(i == c.length - 1){
            ca[i] = c.substring(i);
            sa[i] = s.substring(i);
            }
            else{
            ca[i] = c.substring(i, i+1);
            sa[i] = s.substring(i, i+1);
            }
            if(ca[i] != sa[i]){
            count = count + 1;
            }
        }
		// 出力
		System.out.println(count);
	}
}