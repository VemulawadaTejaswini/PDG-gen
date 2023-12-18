import java.util.*;
public class Main {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int i = 0 ; i < M; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      if(b[i]==N && a[i]!=1 ){
        list.add(a[i]);
      }
    }
    
    int len = list.size();
    if(M < 2 || len == 0){
      System.out.println("IMPOSSIBLE");
      return;
    }
    
    for(int i = 0 ; i < len; i++){
      int tmp = list.get(i);
      for(int j = 0 ; j < M; j++){
        if(b[j] == tmp && a[j] == 1){
          System.out.println("POSSIBLE");
          return; 
        }
      }
    }
    System.out.println("IMPOSSIBLE");
  }
}