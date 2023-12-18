import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();
	String t = scan.next();

	char[] s_ = s.toCharArray();
	char[] t_ = t.toCharArray();
	char[] t_des = new char[t.length()];
	
	Arrays.sort(s_);
	for(int i = 0; i < t.length(); i++){
	    t_des[i] = t_[(t.length()-1)-i];
	}
	
	s = String.valueOf(s_);
	t = String.valueOf(t_des);

	if(s.compareTo(t) < 0){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
