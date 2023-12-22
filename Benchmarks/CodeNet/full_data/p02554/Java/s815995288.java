import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    if(N ==1){System.out.println(0);}
    else if(N ==2){System.out.println(2);}
    else{
      long f =2;
      for(int i=0;i<N;i++){
        f =f*9;
        f =f%1000000007;
      }
      System.out.println(f);
    }
  }
}