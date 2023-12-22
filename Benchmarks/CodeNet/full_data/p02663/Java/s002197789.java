import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int h1=sc.nextInt();
    int m1=sc.nextInt();

    int h2=sc.nextInt();
    int m2=sc.nextInt();

    int k=sc.nextInt();


    if((h2-h1)*60+(m2-m1)-k>=0){
      System.out.println((h2-h1)*60+(m1-m2)-k);
    }else{
      System.out.println(0);
    }

  }
}
