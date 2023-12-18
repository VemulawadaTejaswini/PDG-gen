import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    int a = sc.nextInt();
    int[] b = new int[a];
    int[] c = new int[a];
    int[] d = new int[a-1];
    int ans = 0;
    for(i = 0;i < b.length;i++){
      b[i] = sc.nextInt();
    }
    for(j = 0;j < c.length;j++){
      c[j] = sc.nextInt();
    }
    for(x = 0;x < d.length;x++){
      d[x] = sc.nextInt();
    }
    for(y = 0;y < b.length;y++){
      ans += c[b[y]];
      if(b[y] == b[y+1]+1){
        ans += d[b[y]];
      }
    }  
    System.out.println(ans);
  }
}