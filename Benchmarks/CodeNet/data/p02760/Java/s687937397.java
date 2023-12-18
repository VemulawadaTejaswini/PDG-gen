import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] a = new int[9];
    for(int i = 0; i < 9; i ++){
      a[i] = scan.nextInt();
    }
    int n = scan.nextInt();
    for(int i = 0; i < n; i ++){
      int b = scan.nextInt();
      for(int j = 0; j < 9; j ++){
        if(a[i] == b) a[i] = -1;
      }
    }
    String answer = "No"
    for(int i = 0; i < 3; i ++){
      if(a[i] == a[i+3] && a[i+3] == a[i+6]) answer = "Yes";
    }
    for(int i = 0; i < 8; i += 3){
      if(a[i] == a[i+1] && a[i+1] == a[i+2]){
        answer = "Yes";
      }
    }
    if(a[0] + a[4] + a[8] == -3 || a[2] + a[4] + a[6] == -3){
      answer = "Yes";
    }
    System.out.println(answer);
  }
}