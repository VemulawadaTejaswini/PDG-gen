import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String S=sc.next();
    String T=sc.next();
    String U=sc.next();
    
    int A=sc.nextInt();
    int B=sc.nextInt();
    int ans=0;
   
    
    if(S.equals(U)){
      ans=A-1;
      System.out.println(ans+" "+B);
    }else{
      ans=B-1;
      System.out.println(A+" "+ans);
      }
   }
}