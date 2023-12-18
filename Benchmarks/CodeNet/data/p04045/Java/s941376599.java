import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int D[] = new int[K];
    for(int i=0;i<K;i++){
      D[i]=sc.nextInt();
    }
    for(int i=N;i<=10000;i++){
      if(isLike(i,D)){
        System.out.println(i);
        return;
      }
    }
  }
  
  public static boolean isLike(int n,int[] D){
     String v = String.valueOf(n);
    
    for(int i=0;i<v.length();i++){
      for(int j=0;j<D.length;j++){
        if(Integer.parseInt(v.substring(i,i+1))==D[j]){
          return false;
        }
      }
    }
    
    return true;
    
  }
  

  
}