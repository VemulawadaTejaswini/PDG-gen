import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N =sc.nextInt();
    int a=sc.nextInt();
    for(int i=1;i<N;i++){
      int Min;
      int Max;
      if(Min>a)Min=a;
      if(Max<a)Max=a;
    System.out.println(Max-Min);}
} 
}
