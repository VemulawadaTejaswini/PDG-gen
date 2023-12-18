import java.util.*;
public class Main {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> listN = new ArrayList<>();
    
    for(int i = 0 ; i < M; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      if(a[i] == 1 && b[i]!=N){
        list1.add(b[i]);
      }
      if(b[i] == N && a[i]!=1){
        listN.add(a[i]);
      }
    }
    
    int len = listN.size();
    if(M < 2 || len == 0){
      System.out.println("IMPOSSIBLE");
      return;
    }
    
    for(int i = 0 ; i < len; i++){
      int tmp = listN.get(i);
      for(int j = 0 ; j < list1.size(); j++){
        if(tmp ==list1.get(j)){
          System.out.println("POSSIBLE");
          return; 
        }
      }
    }
    System.out.println("IMPOSSIBLE");
  }
}