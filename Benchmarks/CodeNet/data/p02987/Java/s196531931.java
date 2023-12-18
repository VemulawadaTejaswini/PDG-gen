import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String str[] = new String[S.length()];
        for( int i = 0 ; i < S.length() ; i++ ){
            str[i] = String.valueOf(S.charAt(i));
        }
        Arrays.sort(str);
        String bol = str[0].equals(str[1]) && !(str[1].equals(str[2])) && str[2].equals(str[3]) ? "Yes" : "No" ;
        System.out.println(bol);
	}
}