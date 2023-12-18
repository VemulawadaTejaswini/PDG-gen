import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int N =sc.nextInt();
    int a=sc.nextInt();
    int Min;
    int Max;
    for(int i=1;i<N;i++){
      if(Min>a)Min=a;
      if(Max<a)Max=a;
      System.out.println(Max-Min);}
}   
}
