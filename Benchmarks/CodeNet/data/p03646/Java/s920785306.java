import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long kk = sc.nextLong();
    long a = kk/50;
    int b = (int) kk % 50;
    if(a > 0){
      System.out.println(50);
      long[] arr = new long[50];
      for(int i = 0; i<50; i++){
        arr[i] = 50 + a - 1;
      }
      for(int j = 0; j<b; j++){
        arr[j] += 1;
        System.out.print(arr[j] += 1);
        System.out.print(" ");
      }
      for(int k = b; k<50; k++){
        if(k == 50-1){
          System.out.println(arr[k]);
        }
        System.out.print(arr[k] + " ");
      }
    }else{
      if(b > 1){
        System.out.println(b);
        int[] arr = new int[b];
        for(int i = 0; i<b; i++){
          System.out.print(b + " ");
          if(i == b-1){
            System.out.println(b);
          }
        }
      }else if(b == 1){
        System.out.println(3);
        System.out.println("1 0 3");
      }else if(b == 0){
        System.out.println(4);
        System.out.println("3 3 3 3");
      }
    }
  }
}