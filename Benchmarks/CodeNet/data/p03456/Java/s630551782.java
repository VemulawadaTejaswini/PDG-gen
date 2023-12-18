import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = String.valueOf(sc.nextInt());
      	String b = String.valueOf(sc.nextInt());
       	int target = Integer.parseInt(a+b);
      	String result = String.valueOf(Math.sqrt(target));
		String[] test = result.split("\\.",0);
        if (test[1].equals("0")) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");          
        } 	
    }
}