import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  String a=sc.next();

	  if((int)a.charAt(0)>90) {
		  System.out.println("a");
	  }else {
		  System.out.println("A");
	  }
  }
}

