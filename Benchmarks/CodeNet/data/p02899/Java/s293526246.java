import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int ind[] = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      ind[i] = i+1;
    }
    for(int i=0;i<n;i++){
      int tmp=0;
      int tmpind=0;
      for(int j=0;j<n-1-i;j++){
        if(a[j]>a[j+1]){
          tmp =a[j];
          a[j]=a[j+1];
          a[j+1]=tmp;
          tmpind =ind[j];
          ind[j]=ind[j+1];
          ind[j+1]=tmpind;
        }else{
          continue;
        }
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(ind[i]);
      System.out.print(" ");
    }
        
    
      
    
    
  }
  

  
}