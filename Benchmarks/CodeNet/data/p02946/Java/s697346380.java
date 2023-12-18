import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int left_end = Math.max(-1000000,x - n + 1);
    int right_end = Math.min(1000000,x + n - 1);
    String output = "";
    for(int i = left_end; i < right_end; i++){
      output += i + " ";
    }
    System.out.println(output);
  }
}