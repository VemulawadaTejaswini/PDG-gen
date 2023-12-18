import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int g = 0;
    for(int i=1;i<=m/n;i++)if(m%i==0)g=i;
    System.out.println(g);
  }
}