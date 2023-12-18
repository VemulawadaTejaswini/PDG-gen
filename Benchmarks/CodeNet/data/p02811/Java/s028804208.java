import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt(), x=sc.nextInt(),
    K=500*k;
    if(K<x) System.out.println("No");
    else System.out.println("Yes");
  }
}