import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner scanner = new Scanner(System.in);//new File("input.txt"));
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++){
      arr[i] = scanner.nextInt();
    }

    int min = (1 << 30), ans = 0;
    for(int i = 0 ; i < n ; i++){
      if(arr[i] < min){
        min = arr[i];
        ans += 1;
      }
    }
    System.out.println(ans);
  }
}
