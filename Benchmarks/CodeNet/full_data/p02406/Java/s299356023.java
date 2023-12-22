import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    StringBuilder sb = new StringBuilder();
    for(int i=1; i<= n; i++){
      if(i%3==0){
        sb.append(" ").append(i);

      }
    }
    System.out.println(sb);
  }
}