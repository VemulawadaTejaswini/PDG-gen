import java.util.*;

class Main{
  public static int abs(int a){
    return (a>0)?a:(-a);
  }
  
  public static int max2(int a,int b){
    return (a>b)?a:b;
  }
  
  public static int max3(int a,int b,int c){
    return (max2(a,b)>c)?max2(a,b):c;
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    
    int ab=abs(A-B);
    int bc=abs(B-C);
    int ca=abs(C-A);
    
    int minus=max3(ab,bc,ca);
    
    System.out.println(ab+bc+ca-minus);
  }
}