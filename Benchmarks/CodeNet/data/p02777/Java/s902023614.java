import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String S=sc.next();
    String T=sc.next();
    String U=sc.next();
    
    int A=sc.nextInt();
    int B=sc.nextInt();
   
    
    if(S.equals(U)){
      int Ans=A-1;
      System.out.println(Ans+" "+B);
    }else{
      int Bns=B-1;
      System.out.println(A+" "+Bns);
      }
   }
}
