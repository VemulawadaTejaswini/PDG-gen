import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    for(int i=0;i<N;i++){
      if((i*27>=25*N)&&(i*27<25*N+25)){System.out.println(i);System.exit(0);}}
    System.out.println(":(");
  }
}