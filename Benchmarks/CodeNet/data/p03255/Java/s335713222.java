import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int X = in.nextInt();
      int[] x = new int[N];
      boolean[] isPicked = new boolean[N];

      for (int i = 0; i < x.length; ++i) {
        x[i] = in.nextInt();
      }

      int remain = N;
      long totalEnergy = 0;
      while (remain > 0) {
        int i = x.length - 1;
        
        while (isPicked[i]) {
          --i;
        }
        isPicked[i] = true;
        --remain;
        
        long energy = x[i] + 1;
        int picked = 1;
        int prev = i;
        i--;
        
        while(i >= 0) {
          if (isPicked[i] == false) {
            long notPickedEnergy = (5 * x[i] + 2 * X) + ((picked + 1) * X + (picked + 1) * (picked + 1) * x[prev]);
            long pickedEnergy = (picked + 2) * X + (picked + 1) * (picked + 1) * (x[prev] - x[i]) + (picked + 2) * (picked + 2) * x[prev];

            if (pickedEnergy <= notPickedEnergy) {
              ++picked;
              --remain;
              prev = i;
              isPicked[i] = true;
              energy += (picked + 1) * (picked + 1) * (x[prev] - x[i]);
            }
          }

          --i;
        }

        totalEnergy += energy + (picked + 2) * X + (picked + 1) * (picked + 1) * x[prev];
      }
      
      System.out.println(totalEnergy);
    }
  }
}