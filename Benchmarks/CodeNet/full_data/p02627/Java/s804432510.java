import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String r = "";
		if(Character.isUpperCase(a.charAt(0))){
          r = "A";
        }else{
          r = "a";
        }
	  System.out.println(r);
	  sc.close();
	}
}