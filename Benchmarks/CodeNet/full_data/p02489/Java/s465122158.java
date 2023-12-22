import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int[] a = new int[1000];

    int i = 0;
    for(;;){
      a[i] = in.nextInt();
      if (a[i] == 0)
        break;
      i++;
    }
    for (int j = 0; j < i; j++)
      System.out.printf("case %d: %d\n",j + 1, a[j]);
  }
}