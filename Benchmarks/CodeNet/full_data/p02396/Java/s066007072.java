import java.util.*;
import java.lang.*;
  
public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int i=0,x=stdIn.nextInt();
    while(x!=0){
	i++;
	System.out.println("Case "+i+": "+x);
	x=stdIn.nextInt();
    }
  }
}

