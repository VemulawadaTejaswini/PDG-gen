import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    
    if(A==5&&B==5&&C==7){
      System.out.println("Yes");
    }else if(A==5&&B==7&&C==5){
      System.out.println("Yes");
    }else if(A==7&&B==5&&C==5){
      System.out.println("Yes");
  }else{
System.out.println("No");
    }
}
}
