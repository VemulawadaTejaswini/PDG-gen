import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int[] arr1 = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      arr1[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(int i=0;i<n;i++){
      if(arr1[i]==arr[n-1]){
        System.out.println(arr[n-2]);
      }
      else{
        System.out.println(arr[n-1]);
      }
   }
  }
}