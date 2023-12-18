import java.util.*;

public class Main{
	public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
      
    int A = scn.nextInt();
    int B = scn.nextInt();
    int C = scn.nextInt();
      
    if((B/A)>=C){
    System.out.print(C);
    }else{
    System.out.print(B/A);
    }
    }
}