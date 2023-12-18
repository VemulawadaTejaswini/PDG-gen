import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int []a = new int[n];
  for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt();
  }
  int left = 2*n;
  int right = left+1;

  int [] b= new int[4*n];
  for (int i = 0; i < a.length; i++) {
    if(i%2==0){
      b[right]=a[i];
      right++;
    }else{
      b[left]=a[i];
      left--;
    }
  }
  for (int i = left+1; i < right; i++) {
    System.out.print(b[i]);
    System.out.print(" ");
  }
  }
}
