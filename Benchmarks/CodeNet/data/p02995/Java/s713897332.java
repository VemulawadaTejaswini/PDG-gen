import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int low = sc.nextInt();
    int high = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for(int i = low;i <= high;i++){
      if((i % a != 0) && (i % b != 0)){
        count++;
      }
    }
    System.out.println(count);
  }
}