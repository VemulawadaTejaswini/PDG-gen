import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(),b = sc.nextInt();
    int ans[] = new int[3];
    ans[0] = a+b;
    ans[1] = a-b;
    ans[2] = a*b;
    int max = 0;
    for(int i = 0;i<3;i++){
      if(ans[i] > max){
        max = ans[i];
      }
    }
    System.out.println(max);
  }
}
