import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
 	//鬼の座標
    long a = sc.nextLong();
    //鬼のはやさ
    long v = sc.nextLong();
    //逃げる人の座標
    long b = sc.nextLong();
    //はやさ
    long w = sc.nextLong();
    //秒数
    long t = sc.nextLong();
    
    //逃げる人の方が早い時
    if(v <= w){
      System.out.print("NO");
    }
    //鬼の方が早い
    if(v > w){
      long dist = Math.abs(a - b);
      long dif = v - w;
      if(dist <= dif * t){
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
    }
  }
}
