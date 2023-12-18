import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // 7
    int n = 8;
    int j = 2;
    int k = 0; // カウントする数
    while(((n/j)/2)%2==0){
      if(n%j == 0){
        j = j* 2;
        k = k+1;
      }else{
        break;
      }
    }
    System.out.println(j*2);
  }
}
