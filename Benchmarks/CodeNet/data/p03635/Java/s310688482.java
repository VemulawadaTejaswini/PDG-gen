import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String a = sc.next().split("");
	    System.out.println(a[0]+(a.length()-2)+a[a.length()-1]);
    }
}