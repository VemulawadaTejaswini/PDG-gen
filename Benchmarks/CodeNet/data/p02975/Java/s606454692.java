package thread;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int c =arr[0];
    for(int i=1;i<n;i++){
      c=(c^arr[i]);
    }
    if(c==0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}

