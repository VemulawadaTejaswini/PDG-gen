import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    StringBuilder ans = new StringBuilder();
    
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    for(int j = n-1;j>=0;j--){
      ans.append(a[j]+ " ");
      j--;
    }
    for(int k = n%2;k<n;k++){
      ans.append(a[k]+ " ");
      k++;
    }
    System.out.println(new String(ans));
  }
}