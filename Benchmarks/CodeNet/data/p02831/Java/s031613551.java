import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    long ans = 0;
    for(int i=1; i<=B; i++){
      if((A*i)%B == 0){
        ans = A*i;
        break;
      }
    }
    System.out.print(ans);
  }
}