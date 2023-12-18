import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    Arrays.sort(a);
    Arrays.sort(b);
    reverse(a);
    reverse(b);
    int count = 0;
    for(int i = 0; i < b.length; i++){
      if(b[i] < a[0]) break;
      h -= b[i];
      count++;
    }
    
    System.out.println(count + (int)Math.ceil(h / (double)a[0]));
  }
  
  public static int[] reverse(int[] array){
    for(int i = 0; i < array.length/2; i++){
      int tmp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = tmp;
    }
    return array;
  }
}