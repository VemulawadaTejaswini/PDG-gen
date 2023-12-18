import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] l = new int[n];
    for(int i=0; i<n; i++){
      l[i] = sc.nextInt();
    }
    int d = 0;
    
    for(int i=1; i<=n; i++){
      d = d+l[i-1];
      if(d>x) break;
    }
    System.out.println(i-1);
  }
}