import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] l = new int[n];
    for(int i=0; i<n; i++){
      l[i] = Integer.parseInt(sc.next());
    }
    int ans = 0;

    Arrays.sort(l);

    for(int i=0; i<n; i++){
      for(int j=0; j<i; j++){
        if(l[j] == l[i]){
          continue;
        }
        for(int k=0; k<j; k++){
          if(l[j] == l[k]){
            continue;
          }
          if(l[j]+l[k]>l[i]){
            ans++;
            // System.out.format("%d,%d,%d\n",l[i],l[j],l[k]);
          }
        }
      }
    }
    
    System.out.println(ans);
   
    sc.close();
    return;
  }
  
}
