import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String n = sc.next();
      String[] ns = n.split("");
      if(ns[ns.length - 1].equals("2") || ns[ns.length - 1].equals("4") ||
        ns[ns.length - 1].equals("5") || ns[ns.length - 1].equals("7") || 
        ns[ns.length - 1].equals("9")){
		System.out.println("hon");
      } else if(ns[ns.length - 1].equals("3")){
      	System.out.println("bon");
      } else {
      	System.out.println("pon");
      }
      
      
	}
}