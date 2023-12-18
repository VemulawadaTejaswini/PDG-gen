import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int x[] = new int[n];
    int c[] = new int[n];
    int t = 0;
    int min = 1000000000;
    int p = 0;
    
    for(int i=0; i<n; i++){
      x[i] = Integer.parseInt(sc.next());
    }
    
    for(int i=1; i<=100; i++){
      t = 0;
      for(int j=0; j<n; j++){
        t += (i-x[j])*(i-x[j]);
      }
      if(t<min) {
        min = t;
      }
    }
    
    System.out.println(min);
    
  }
}
