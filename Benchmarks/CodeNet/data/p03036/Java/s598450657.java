import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int D = sc.nextInt();
    int i = sc.nextInt();
    int box = 0;
    
    for(int j= 0;j < 10;j++){
      box = (r * i) - D;
      System.out.println(box);
      i = box;
    }
  }
}