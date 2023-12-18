import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    String src;
    int n;
    int[] d;
    
    
    
    Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
    
    d = new int[n];
    
    
    for (int i = 0; i < n; i++) {
      d[i] = sc.nextInt();
    }
    
    int sum = 0;
    
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        sum += d[i] * d[j];
      }
    }
    
    
    System.out.println(sum);
    
    return;
  }
}

    
    
    