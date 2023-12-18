import java.util.Scanner;
import java.util.Arrays;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar= new int[n];
    boolean F = false;
    for(int i=0;i<n;i++){
      ar[i] = sc.nextInt();
      if(ar[i]%2 == 1){
        F = true;
      }
    }
    if(F == true){
      System.out.println(0);
    }else{
      int numbers =new int[n];
      for(int i=0;i<ar.length;i++){
        numbers[i] = ar[i];
      }
      int min = Arrays.stream(numbers).min().getAsInt();
      
      int times = 0;
      while(min%2 == 0){
        min /= 2;
        times++;
      }
      System.out.println(times);
    }
  }
}