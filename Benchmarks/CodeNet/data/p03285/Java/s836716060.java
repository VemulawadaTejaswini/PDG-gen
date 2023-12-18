import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c = 4;
    int d = 7;
    int count = sc.nextInt();
    int total = 0;
    String answer = "No";
    for(int i=0;i<30;i++) {
      for(int j=0;j<30;j++) {
      	total = c * i + d * j;
        if(total == count) {
          answer = "Yes";
        }
      }
  	}
    System.out.println(answer);
  }
}