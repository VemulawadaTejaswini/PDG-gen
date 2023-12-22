import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] r = new int[n];
    for(int i = 0; i < n; i++){
      r[i] = stdIn.nextInt();
    }

    int min = r[0];
    int maxp = r[1] - r[0];
    for(int i = 1; i < n; i++){
      int prof = r[i] - min;
      if(prof > maxp)
        maxp = prof;
      if(r[i] < min)
        min = r[i];
    }

    System.out.println(maxp);
  }
}