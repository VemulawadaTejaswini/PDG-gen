import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr [] = new int[n];
    for(int i=0 ; i<n ; i++)
    {
      arr[i] = sc.nextInt();
    }
    long mult = 1;
    for(int i=0 ; i<n ; i++)
    {
      mult = mult * arr[i];
    }
    System.out.println(mult);
  }
}