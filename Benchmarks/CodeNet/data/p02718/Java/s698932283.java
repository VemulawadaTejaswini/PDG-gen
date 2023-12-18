import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    
    Arrays.sort(a);
    
    int ms = 0;
    
    for(int j=0;j<m;j++){
      ms = ms+a[n-m+j];
    }
    
    if(ms<1/(4*M)){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}

    
   