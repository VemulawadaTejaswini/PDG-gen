import java.util.*;
import java.io.*;
 
class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long result = 1;
    boolean flag = true;
    long num = 1000000000000000000l;
    long[] arr = new long[n];
    
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();
        if (arr[i] == 0) {
            System.out.println(0);
            System.exit(0);
        }
    }
    Arrays.sort(arr);
    for(int i = 0; i < n; i++) {
      	if(flag) result = result*arr[i];
      	if(result > num || result < 1) flag = false;
    }
    
    if(flag) System.out.println(result);
    else System.out.println(-1);
  }
}