import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a+b+c-maxValue(a,b,c)==maxValue(a,b,c)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  public static int maxValue(int a,int b,int c){
    int max = a;
    if(max<b) max = b;
    if(max<c) max = c;
    return max;
  }
}