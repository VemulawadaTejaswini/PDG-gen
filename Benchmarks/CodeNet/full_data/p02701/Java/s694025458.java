import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] a = new String[n];
    for(int i = 0;i < n;i++){
      a[i] = sc.next();
    }
    Arrays.sort(a);
//    System.out.println(Arrays.toString(a));
    int count = 1;
    for(int j = 1;j < n;j++){
      if(a[j].equals(a[j - 1])){
        count--;
      }
      count++;
    }
    System.out.println(count);
  }
}