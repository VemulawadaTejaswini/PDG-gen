import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();

    while(input1>0) {
      boolean[][] arr = new boolean[input1][input1];
      for(int i = 0; i < input1; i++) {
        int input2 = scan.nextInt();
        for(int j = 0; j < input2; j++) {
          int dummy = scan.nextInt()-1;
          arr[i][dummy] = true;
          arr[dummy][i] = true;
        }
      }

      int k = scan.nextInt();
      int[] bareta = new int[k];
      for(int i = 0; i < k; i++) {
        bareta[i] = scan.nextInt();
      }

      ArrayList<Integer> al = new ArrayList<>(input1);
      for(int i = 0; i < input1; i++) {
        al.add(i+1);
      }

      for(int i = 0; i < k; i++) {
        Iterator ite = al.iterator();
        while(ite.hasNext()) {
          if(!arr[bareta[i]-1][(int)ite.next()-1]) {
            ite.remove();
          }
        }
      }

      System.out.println((al.size()>1||al.size()==0)?-1:al.get(0));

      input1 = scan.nextInt();
    }
  }
}