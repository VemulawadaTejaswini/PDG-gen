import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c=0;
    int flg=0;
    while(n-->0){
      int x = sc.nextInt();
      int y = sc.nextInt();
      if(c==3){
        flg=1;
      }
      if(x==y){
        c++;
      }
      else{
        c=0;
      }
    }
    if(flg==0){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
  }
}