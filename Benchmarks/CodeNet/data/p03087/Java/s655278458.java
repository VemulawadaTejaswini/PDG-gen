import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    int[] a = new int[n];
    Arrays.fill(a, 1000000);
    int index = 0;
    String s = sc.next();
    int[] l = new int[q];
    int[] r = new int[q];
    for(int i = 0; i < q; i++){
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }
    for(int i = 0; i < n-1; i++){
      char c = s.charAt(i);
      if(c == 'A' && s.charAt(i + 1) == 'C'){
        a[index] = i; 
        index++;
        i++;
      }
    }
    Arrays.sort(a);
    for(int i = 0; i < q; i++){
      int start = Arrays.binarySearch(a, l[i] - 1);
      int end = Arrays.binarySearch(a, r[i] - 1);
      if(start < 0){
        start = ~start;
      }
      if(end < 0){
        end = ~end;
      }
      System.out.println(end - start);
    }
  }
}