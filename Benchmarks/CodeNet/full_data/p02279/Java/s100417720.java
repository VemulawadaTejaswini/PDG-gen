import java.util.*;

public class Main {
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[][] C = new int[n][10];
   int[] k = new int[n];
   int[] p = new int[n];
   int[] d = new int[n];
   int[] ty = new int[n];/*0:root, 1:internal node, 2:leaf*/
   for(int i = 0;i < n;i++){
      p[i] = -1;
      d[i] = 0;
      ty[i] = 1;
   }
   for(int i = 0;i < n;i++){
     for(int j = 0;j < 10;j++){/*配列の初期化*/
       C[i][j] = 0;
     }
   } 
   for(int i = 0;i < n;i++){/*入力*/
     int id = sc.nextInt();/*節点の番号 */
       k[id] = sc.nextInt();
       
     for(int j = 1;j <= k[id];j++){
      if(k[id] == 0){
        ty[C[id][j]] = 2;        
       }
       C[id][j] = sc.nextInt();
       p[C[id][j]] = id;
       if(p[C[id][j]] == -1){
         d[C[id][j]] = 0;
         ty[C[id][j]] = 0;
       }
       else d[C[id][j]] = d[id] + 1;
     }
   }
   for(int i = 0;i < n;i++){/*出力*/
    /*debug*///System.out.println("k["+i+"] = "+k[i]);
     System.out.print("node "+i+":");
     System.out.print(" parent = "+p[i]+", ");
     System.out.print("depth = "+d[i]+", ");
     if(ty[i] == 0){
      System.out.print("root, ");
     }
     else if(ty[i] == 2){
      System.out.print("leaf, ");
    }
      else if(ty[i] == 1){
        System.out.print("internal node, ");
      }
     System.out.print("[");
     for(int j = 1;j <= k[i];j++){
       System.out.print(C[i][j]);
       if(j != k[i]) System.out.print(", ");
     }
     System.out.print("]");
     System.out.println();
   }
  }
}
