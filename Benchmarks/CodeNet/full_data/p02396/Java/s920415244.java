import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int [] n = new int [10000];
    int m = 0;
    Scanner sc = new Scanner(System.in);
    for(int i=0;;i++){
      int x = sc.nextInt();
      if(x == 0) break;
      m++;
      n[i]=x;
    }
    for(int j=0;j<m;j++){
      System.out.println("Case " + (j + 1) + ": " +n[j]);
    }
  }
}
