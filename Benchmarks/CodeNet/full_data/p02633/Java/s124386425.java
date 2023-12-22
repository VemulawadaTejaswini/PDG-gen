import java.util.*;
class Main{
    
	public static void main (String[] args) throws java.lang.Exception{
       Scanner scan =  new Scanner(System.in);
        int x = scan.nextInt();
        if(360%x!=0) return;
       else
           System.out.println(360/x);}
}