import java.util.Scanner;
import static java.lang.System.exit;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] A = new int[n+1];
    for (int i = 0; i < n+1; i++) 
      A[i] = sc.nextInt();
    
    if (n == 0 && A[0] == 1) {
      System.out.println("1");
      exit(0);
    }
    
    if (A[0] != 0) {
      System.out.println("-1");
      exit(0);
    }
    
    int vertex = 1;
    int[] node = new int[n];
    node[0] = 2;
    for (int i = 1; i < n; i++) {
      if (A[i] > node[i-1]) {
        System.out.println("-1");
        exit(0);
      }
      vertex += node[i-1];
      node[i] = (node[i-1] - A[i]) * 2;
    }

    if (A[n] > node[n-1]) {
      System.out.println("-1");
      exit(0);
    }
    vertex += A[n];
    
    int check = 0;
    for (int i = n; i >= 2; i--) {
      if ((node[i-2] - A[i-1]) < A[n]) break;
      vertex -= node[i-2] - A[i-1] - A[n];
      check = 1;
    }
    if (check == 1)
	    vertex += A[n-1];
    
    System.out.println(vertex);
  }
}
