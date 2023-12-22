import java.util.Scanner;

class Main{

  static boolean isIncluded(int[] a, int x){
    for(int i = 0; i < a.length; i++)
      if(a[i] == x)
        return true;

    return false;
  }

  public static void main(String[] arsg){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] a = new int[n];

    for(int i = 0; i < n; i++)
      a[i] = stdIn.nextInt();

    int q = stdIn.nextInt();
    int count = 0;
    for(int i = 0; i < q; i++){
      int x = stdIn.nextInt();
      if(isIncluded(a, x))
        count++;
    }

    System.out.println(count);
  }
}