import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
 
    //座標A
    int a = sc.nextInt();
    //鬼役のスピード
    int v = sc.nextInt();
    
    //座標B
    int b = sc.nextInt();
    //はやさ
    int w = sc.nextInt();
    //秒数
    int t = sc.nextInt();
    
    for(int i = 0; i < t; i++){
      a += v;
      b += w;
      if(a == b){
        System.out.println("YES");
        break;
      }
    }
    
    System.out.println("NO");
  }
}
