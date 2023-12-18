import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int X =sc.nextInt();
    if(X>=2000){System.out.println(1);}
    if(X<100){System.out.println(0);}
    else{
      for(int i=1;i<20;i++){
        if(X<=105*i){
          if(X>=100*i){System.out.println(1);System.exit(0);}
          else{System.out.println(0);System.exit(0);}
        }
      }
    }
  }
}
      