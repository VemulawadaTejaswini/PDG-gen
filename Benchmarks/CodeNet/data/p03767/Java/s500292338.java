import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] a = new int[3*n];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    for(int i=0; i<n; i++){
      a[i] = 0;
    }
    for(int i=a.length-1; i>a.length-1-n; i--){
      a[i] = 0;
    }
    int sum = 0;
    for(int i=0; i<a.length; i++){
      sum += a[i];
    }
    
    System.out.println(sum);

    sc.close();
  }
}