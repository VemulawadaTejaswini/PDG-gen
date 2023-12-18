import java.util.*;
public class Main {
    public static void main(String[] args){
      ArrayList<Integer> hoge = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
      
      int[] a = new int[n - 1];
      
      for(int u = 0; u < a.length; u++){
        a[u] = sc.nextInt();
      }
        
       for(int i = 1; i <= n; i++){
         int count = 0;
         for(int s = 0; s < a.length; s++){
           if(i == a[s]){
             count++;
           }
         }
         System.out.println(count);
       }
      
      sc.close();
    }
}