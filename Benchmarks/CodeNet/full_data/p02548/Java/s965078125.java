import java.util.*;
import java.math.BigInteger;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long ans =0;
    for(int i=1;i<N;i++){
      int w =N/i;
      if(N%i==0){w =w-1;}
      ans =ans+w;}
    System.out.println(ans);
  }
}