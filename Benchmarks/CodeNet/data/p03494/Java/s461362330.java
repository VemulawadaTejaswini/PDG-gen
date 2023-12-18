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
    
    while(true){
      //if((a[0] + a[1] + a[2]) % 2 != 0){
      if((a[0] % 2 != 0) || (a[1] % 2 != 0) || (a[2] % 2 != 0)){
		break;
      }
      count++;
      a[0] = a[0] / 2;
      a[1] = a[1] / 2;
      a[2] = a[2] / 2;
    }
    System.out.println(count);
  }
}