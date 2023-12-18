import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 文字列の入力                                                 
        String s = sc.next();
	if(s.length()C < 4) System.out.println("No");
	else if(s.substring(0,4).equals("YAKI")) System.out.println("Yes");
	else System.out.println("No");

    }
}
