import java.util.*;

class Main
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    int[] town = new int[n];
    for (int i = 0; i < n; i++) {
      town[i] = sc.nextInt();
    }
    
    int arrivaltown = 0;
    for (int i = 0; i < k - 1; i++) {
      arrivaltown = town[arrivaltown];
    }
    System.out.println(arrivaltown);
  }
}