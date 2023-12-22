import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M =sc.nextInt();
    for(int i=1;i<=M;i++){
      System.out.println(i+" "+N-i+1);}
  }
}