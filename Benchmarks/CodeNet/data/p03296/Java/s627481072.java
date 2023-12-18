import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int cnt = 0;
      int sum = 0;
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      for(int i = 0;i < n-1;i++){
      	if(a[i]==a[i+1])cnt++;
        else{
          sum+=cnt/2;
          cnt = 0;
        }
      }
      System.out.println(sum);
    }
}