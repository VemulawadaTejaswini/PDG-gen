import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] array = new int[n];
    int count = 0;

    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
    }

    for(int i=0; i<n-1; i++){
      if(array[i]>=array[i+1]){
        count += 1;
      }else{
        count = 0;
      }
    }
    System.out.println(count);
  }
}