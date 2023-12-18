import java.util.*;
public class Main{
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] arr = new String[n];
    for(int i=0;i<n;i++){
      String a = sc.next();
      arr[i]=sort(a);
    }
    Arrays.sort(arr);
    int count=0;
    long sum=0;
    for(int i=0;i<n-1;i++){
      if(arr[i].equals(arr[i+1])){
        count++;
    //    System.out.println(count);
      }
        else{
        //  System.out.println("anuj");
          sum=sum+((count+1)*(count))/2;
          count=0;
        }
      }
    if(count>0){
      sum=sum+((count+1)*(count))/2;
    }
         System.out.println(sum);
  }
  public static String sort(String x){
    char[] arr = x.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
  }
}