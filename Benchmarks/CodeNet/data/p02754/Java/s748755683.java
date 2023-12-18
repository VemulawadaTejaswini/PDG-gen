import java.util.*;
class Main{
	public static void main(String[]args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
      if(a == 0) System.out.println("0");
      System.out.println((n-(a+b))+a);
    }
}