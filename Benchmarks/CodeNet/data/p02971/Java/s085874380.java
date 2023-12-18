import java.util.*;
import java.util.Arrays;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;;
    int[] a = new int[n]; 
    for(i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int[] sa = a.clone();
    Arrays.sort(sa);
    for(i=0;i<n;i++){
      if(sa[n-1]>a[i]){
        System.out.println(sa[n-1]);
      }else{
        System.out.println(sa[n-2]);
      }
    }
  }
}