import java.util.Scanner;

class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    for(int i=0;i<n+1;i++){
      a[i] = sc.nextInt();
    }
    int[] b = new int[n];
    for(int i = 0;i<n;i++){
      b[i] = sc.nextInt();
    }
    int result = 0;
    for(int i = n-1;i >= 0;i--){
      if(b[i] >= a[i+1]){
        result = result + a[i+1];
        b[i] = b[i] - a[i+1];
        a[i+1] = 0;
      }else{
        result = result + b[i];
        b[i] = 0;
      }
      
      if(b[i] >= a[i]){
        result = result + a[i];
        b[i] = b[i] - a[i];
        a[i] = 0;
      }else{
        result = result + b[i];
        b[i] = 0;
      }
    }
    System.out.println(result);

  }
}
    
    
