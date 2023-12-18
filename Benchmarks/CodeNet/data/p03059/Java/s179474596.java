import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int t = sc.nextInt();
    int cnt = 0;
    for (int i = 0;i<t+0.5;i++){
      if(i%a==0 && i!=0){
        cnt = cnt + b;
      }
    }
    System.out.println(cnt);
  }
}
    
