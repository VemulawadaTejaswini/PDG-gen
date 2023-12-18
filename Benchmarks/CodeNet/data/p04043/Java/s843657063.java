import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    int x=0;
    if(A==7){
      x=x+1;
    }
    if(B==7){
      x=x+1;
    }
    if(C==7){
      x=x+1;
    }
 
    if(x>1)
      System.out.println("No");
    
    else
      System.out.println("Yes");
    
   
  }
}