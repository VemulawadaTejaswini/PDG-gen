import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    int count = 0;
    for(int i = -1000000;i<1000001;i++){
      if(x-k+1<=i&&i<=x+k-1)System.out.println(i);
    }
  }
}
