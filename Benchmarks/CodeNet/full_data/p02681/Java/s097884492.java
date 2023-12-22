import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String befId = sc.next();
	String aftId = sc.next();
    String trancatedLast = aftId.substring(0, aftId.length()-1);
    //check
    //System.out.println(trancatedLast);
    
    if(befId.equals(trancatedLast)){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }

  }
}

