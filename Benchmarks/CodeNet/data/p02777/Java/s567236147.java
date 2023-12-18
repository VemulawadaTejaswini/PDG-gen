import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String S=sc.next();
    String T=sc.next();
    String U=sc.next();
    
    int A=sc.nextInt();
    int B=sc.nextInt();
    
    if(S.equals(U)){
      A--;
    }else{
      B--;
      }System.out.println(A+" "+B);
   }
}
