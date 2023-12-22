import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int n = sc.nextInt();
    int[] p = new int[n];
    for(int i=0; i<n; i++){
      p[i] = sc.nextInt();
    }
    Arrays.sort(p);
    int[] np = new int[101-n];
    int a = 0;
    int b = 0;
    for(int i=0; i<=100; i++){
      if(a<n && p[a]==i){
        a++;
      }
      else{
        np[b++] = i-x;
      }
    }
    int min = 100;
    int ans = 0;
    for(int i=0; i<101-n; i++){
      if (min>Math.abs(np[i])){
        min = Math.abs(np[i]);
        ans = np[i];
      }
    }
    System.out.println(ans+x);
  }
}