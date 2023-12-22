import java.util.*;

public class Main
{
  public static void main(String[] args)
  {  	
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    int total = 0;

    arr[0] = sc.nextInt();
    for (int i = 1; i<n; i++)
    {
        arr[i] = sc.nextInt();
        if (arr[i-1] - arr[i] > 0)
        {
            total += arr[i-1] - arr[i];
            arr[i] = arr[i-1];
        }
    }

    System.out.println(total);
  }
}