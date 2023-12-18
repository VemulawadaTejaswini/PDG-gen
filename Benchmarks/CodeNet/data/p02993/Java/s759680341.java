import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String S=in.next();
    if(S.charAt(0)==S.chartAt(1))
      System.our.println("Bad");
    else if(S.charAt(1)==S.chartAt(2))
      System.our.println("Bad");
    else  if(S.charAt(2)==S.chartAt(3))
      System.our.println("Bad");
    else
    	System.out.println("Good");
    in.close();
  }
}