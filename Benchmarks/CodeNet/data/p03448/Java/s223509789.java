import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int x = scan.nextInt();

    int i = 0,j,k,check = 0,cnt = 0;
    while(i <= a){
      j = 0;
      while(j <= b){
        k = 0;
        while(k <= c){
          check = 500*i + 100*j + 50*k;
          if (check == x) {
            cnt++;
          }
          k++;
        }
        j++;
      }
      i++;
    }
    System.out.println(cnt);
  }
}
