import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < a.length; i++){
      a[i] = 0;
    }
    for(int i = 0; i < n-1; i++){
      a[s.nextInt()-1]++;
    }
    for(int i:a){
      System.out.println(i);
    }
  }
}