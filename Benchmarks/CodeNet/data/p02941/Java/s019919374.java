import java.util.Scanner;

public class Main{
  public static int maxIndex(int[] array){
    int n = array.length;
    int max = 0;
    for(int i = 1; i < n; i++){
      if(array[i] > array[max]){
        max = i;
      }
    }
    return max;
  }
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    int[] aa = new int[n];
    int[] b = new int[n];
    int[] bb = new int[n];
    int achieved = 0;
    int step = 0;
    for(int i = 0; i < n; i++){
      int tmp = scanner.nextInt();
      a[i] = tmp;
      aa[i] = tmp;
    }
    for(int i = 0; i < n; i++){
      int tmp = scanner.nextInt();
      b[i] = tmp;
      bb[i] = tmp;
    }
    while(true){
      int max = maxIndex(bb);
      if(a[max] == bb[max]){
        bb[max] = -1;
        achieved++;
      }else{
        bb[max] -= b[(max-1)>=0?max-1:n-1];
        bb[max] -= b[(max+1)<n?max+1:0];
        b[max] = bb[max];
        if(bb[max] < a[max]){
          step = -1;
          break;
        }else if(bb[max] == a[max]){
          bb[max] = -1;
          achieved++;
        }
      }

      step++;
      if(achieved == n){
        break;
      }
    }
    
    System.out.println(step);
  }
}
