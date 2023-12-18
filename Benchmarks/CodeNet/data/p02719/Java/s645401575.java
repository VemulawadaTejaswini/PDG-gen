import java.util*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int K =sc.nextInt();
    int C =N%K;
    int D =K/2;
    if(C<=K/2){System.out.println(C);}
    else{System.out.println(K-C);}
  }
}