import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int [] a = new int[n];
    for(int i =0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int count = 0;
    Arrays.sort(a);
    for(int i =0;i<n-2;i++){
      for(int j =i+1;j<n-1;j++){
        for(int k =j+1;k<n;k++){
          // System.out.println(a[i] + " "+ a[j] +  " " +a[k]);
          if(a[i]!=a[j] && a[j]!=a[k] && a[k]!=a[i]){
            if(a[i]+a[j]>a[k]){
              // System.out.println("!"+a[i] + " "+ a[j] +  " " +a[k]);
              count++;
          }
        }
      }  
    }
  }
  System.out.println(count);
  }
}

