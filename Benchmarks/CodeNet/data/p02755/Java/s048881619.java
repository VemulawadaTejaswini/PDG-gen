import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    if(5*A-4*B>=4){System.out.println(-1);}
    else{if(5*A-4*B<=0){System.out.println(10*B);}
    else{System.out.println((25*A+A%2)/2);}
        }
  }
}