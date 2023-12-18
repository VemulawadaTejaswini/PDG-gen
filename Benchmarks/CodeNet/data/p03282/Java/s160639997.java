import java.util.*;

public class Main{
	public static void main(String[] argc){
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String tmp = sc.next();
        long l = Long.parseLong(tmp);

        if(s.charAt(0) == '1'){
            System.out.println(s.charAt(1));
        }else{
            System.out.println(s.charAt(0));
        }
    }
}