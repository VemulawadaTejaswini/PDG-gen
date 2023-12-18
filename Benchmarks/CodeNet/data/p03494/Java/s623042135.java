import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int che = 30;
    for(int i = 1 ; i <= n ; i++){
      int a = sc.nextInt();
      int zyo = 0;
      int cou = 0;
      while(zyo == 0){
        if(a % 2 == 1){
          zyo = 1;
        }else{
          cou = cou + 1;
          a = a / 2;
        }
      }
      if(cou < che){
         che = cou;
      }
    }
    System.out.println(che);
    sc.close();
  }
}
