import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	String a = sc.next();
      	String b = sc.next();
      	String res = "";
      	
      	for (int i = 0; i < a.length(); i++) {
          res += (a.charAt(i) + b.charAt(i));
        }
      	
      	System.out.println(res);
    }
}