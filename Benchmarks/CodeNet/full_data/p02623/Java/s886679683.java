import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();

    int arrayLength = n > m ? n + 1 : m + 1;

    long[] a = new long[arrayLength];
    long[] b = new long[arrayLength];

    for(int i=0; i<n; i++){
      a[i] = sc.nextLong();
    }
    a[n] = 1000000001;
    for(int i=0; i<m; i++){
      b[i] = sc.nextLong();
    }
    b[m] = 1000000001;

    int ap = 0;
    int bp = 0;
    long spentTime = 0;
    int counter = 0;
    
    while(spentTime <= k){

      if(a[ap] < b[bp]){
        spentTime += a[ap];
        if(spentTime <= k){
          ap++;
          counter++;
        }else{
          break;
        }
      }else{
        spentTime += b[bp];
        if(spentTime <= k){
          bp++;
          counter++;
        }else{
          break;
        }
      }
    }

    System.out.println(counter);

  }
}