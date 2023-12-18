import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
	int l = Integer.parseInt(sc.next());
    
	int x[] = new int[n];
    int y[] = new int[n];
    
    for(int i=0; i<n; i++){
      x[i] = Math.abs(l + i);
      y[i] = l + i;
    }
    
    Arrays.sort(x);
    
	int ans = 0;
	
    for(int i=0; i<n; i++){
      ans += y[i];
    } 

    int sub = 0;
    for(int i=0; i<n; i++){
      if(x[0] == Math.abs(y[i])){
        sub = y[i];
        break;
      }
    }
    
    System.out.println(ans - sub);
    
  }
}
