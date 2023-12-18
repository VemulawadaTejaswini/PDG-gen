import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int[] l = new int[n];
    for(int i=0; i<n; i++){
      l[i] = Integer.parseInt(sc.next());
    } 
    int ans = 1;
    int dictance = 0;

    for(int j=0; j<n; j++){
      dictance += l[j];
      if(dictance>x){
        break;
      }

      ans++;
    }

    System.out.println(ans);
  }
}