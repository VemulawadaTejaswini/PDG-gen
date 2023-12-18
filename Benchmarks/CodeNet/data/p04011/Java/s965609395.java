import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.nextLine());
    int k = Integer.parseInt(sc.nextLine());
    int x = Integer.parseInt(sc.nextLine());
    int y = Integer.parseInt(sc.nextLine());
    int pay = 0;
    
    for(int i = 1; i <= n; i++){
      if(i <= k){
        pay += x;
      }else{
        pay += y;
      }
    }
    
    System.out.println(pay);
  }
}