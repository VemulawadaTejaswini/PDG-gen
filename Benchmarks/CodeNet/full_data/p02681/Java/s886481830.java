import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String t = sc.next();
	if(s.length()>10||s.length()<1){
	    System.out.println("No");
	    System.exit(0);
	}
	if(t.length()!=s.length()+1){
	    System.out.println("No");
	    System.exit(0);
	}
	if(!(s.equals(t.substring(0,t.length()-1)))){
	    System.out.println("No");
	    System.exit(0);
	}
	System.out.println("Yes");
      }
}
