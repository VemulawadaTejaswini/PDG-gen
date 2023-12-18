import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		String a = sc.nextString();
		if ("ABC".equals(a)) {
          System.out.println("ARC");
        }else if ("ARC".equals(a)){
          System.out.println("ABC");
        }
	}
}