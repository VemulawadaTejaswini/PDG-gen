import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    int count = 0;
    int max = 0;

    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
      if(max<=array[i]){
        count += 1;
        max = array[i];
      }
    }
    System.out.println(count);
  }
}
