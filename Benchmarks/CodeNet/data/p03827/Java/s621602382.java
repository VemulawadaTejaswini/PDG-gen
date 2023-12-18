import java.util.*;

class Main{
  public static void main(String[] args){
    int x = 0;
    int xmax = 0;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    for(int i = 0;i < N;i++){
      /*if文があやしい。だめなら一旦
      String Spart = S.substring(i.i + 1);
      として、ifの条件式にSpartと入れてみようかな*/
      if(S.substring(i,i + 1).equals("I")){
        x++;
      }else{
        x--;
      }
      if(x > xmax){
        xmax = x;
      }
    }
    System.out.println(xmax);

  }
}
