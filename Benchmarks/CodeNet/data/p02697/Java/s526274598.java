import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M =sc.nextInt();
    for(int i=1;i<=M;i++){
      int C =N-i+1;
      System.out.println(i+" "+C);}
  }
}
