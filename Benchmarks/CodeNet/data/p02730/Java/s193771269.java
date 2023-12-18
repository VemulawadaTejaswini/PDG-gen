import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String N=sc.next();
    String n[] =N.split("",0);
    int m=N.length();
    int M=m/2
    for(int i=0;i<M;i++){
      if(!(n[i].equals(n[m-1-i]))){System.out.println("No");System.exit(0);}
      if(!(n[i].equals(n[M+1+i]))){System.out.println("No");System.exit(0);}}
    int X=M/2;
    for(int j=0;j<X;j++){
      if(!(n[j].equals(n[M-1-j]))){System.out.println("No");System.exit(0);}}
    System.out.println("Yes");
  }
}