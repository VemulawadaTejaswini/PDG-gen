import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        
        sc.close();
        
        String[] strArray1 = new String[s1.length()];
        String[] strArray2 = new String[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
        strArray1[i] = String.valueOf(s1.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++) {
        strArray2[i] = String.valueOf(s1.charAt(i)).toLowerCase();
        }
        for (int i = 0; i < s1.length(); i++) {
            if(strArray2[i].equals(strArray2[i])){
                strArray1[i] = strArray2[i].toUpperCase();
            }
            
        }
        for (int i = 0; i < strArray1.length; i++) {
        System.out.print(strArray2[i]);
        }
	}

}

