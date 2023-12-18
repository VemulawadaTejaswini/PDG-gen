import java.util.*;

public class Main{
  public void battle(int n,int[] a) {
    int AP = 0;
    int BP = 0;
    int count = 0;
    
    for (int i = n-1;i >= 0;i--) {
      if (count%2== 0) AP += a[i];
      else BP += a[i];
      count++;
    }
    
    int SP = AP -BP;
    
    System.out.println(SP);
  }

  public static void main (String args[]) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    
    int array[] = new int[N];
    
    for (int i = 0;i < N;i++) {
      array[i] = scan.nextInt();
    }
    
    Arrays.sort(array);
    
    Main main = new Main();
    
    main.battle(N,array);
  }
}