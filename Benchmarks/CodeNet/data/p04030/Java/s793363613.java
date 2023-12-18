import java.util.*;

public class Main {

    public static int sum(int n){
        return (1+n)*n/2;
    }

    public static String conv(String in){
        String result = "";
        int i = 1;
        for (; i < in.length(); i++) {
            if (in.charAt(i) != 'B') {
                result += in.charAt(i-1);
            }
        }
        if (in.charAt(i) != 'B') {
            result += in.charAt(i);
        }
        return result;
    }
    
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
		System.out.println(conv(a));
	}
}
