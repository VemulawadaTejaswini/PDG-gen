import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();
    int[] order = new int[n];
    String out = "";
    for(int i = 1; i <= n; i++){
      order[sc.nextInt() - 1] = i;
    } 
    for(int i = 0; i < n; i++){
    System.out.println(order[i]);
    }
  }
}