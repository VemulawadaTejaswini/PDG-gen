import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] X = new int[n];
    int max = 0;
    
    for(int i=0; i<n; i++){
      X[i] = sc.nextInt();
      if(i == 0){
        max = X[i];
      }else if(max < X[i]){
        max = X[i];
      }else{}
    }
    
    int min = 999999;
    int total = 0;
    
    for(int i=1; i<max/2; i++){
      for(int j=0; j<n; j++){
        total += (X[i]-j) * (X[i]-j);
        if(j == n-1 && min > total){
          min = total;
          total = 0;
        }
      }
    }
    
    System.out.println(min);
    
  }
}
