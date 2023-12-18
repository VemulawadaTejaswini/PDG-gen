import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    int count = 0;
    
    uncode: while(true){
      //if((a[0] + a[1] + a[2]) % 2 != 0){
      for(int i = 0; i < n; i++){
        if(a[i] % 2 != 0){
          break uncode;
        }
        a[i] = a[i] / 2;
      }
      count++;
    }
    System.out.println(count);
  }
}