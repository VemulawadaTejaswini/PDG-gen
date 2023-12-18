import java.util.*;
public class Main{
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] arr = new String[n];
    for(int i=0;i<n;i++){
      String a = sc.next();
      arr[i]=sort(a);
   //   System.out.println(arr[i]);
    }
    long count=0;
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i].equals(arr[j])){
          count++;
        }
      }
     
  }
     System.out.println(count);
  }
  public static String sort(String x){
    char[] arr = x.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
  }
}