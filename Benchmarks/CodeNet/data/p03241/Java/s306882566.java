import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int g = 0;
    for(int i=1;i<=Math.min(m/n,2);i++)if(m%i==0)g=i;
    for(int i=3;i<=m/n;i+=2)if(m%i==0)g=i;
    System.out.println(g);
  }
}
