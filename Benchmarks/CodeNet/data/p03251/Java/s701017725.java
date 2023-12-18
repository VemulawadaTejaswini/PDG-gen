import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    int[] a=new int[n];
    int[] b=new int[m];
    int temp=0;
    int flag=0;
    for(int i=0;i<n;++i){
      temp=a[i]>temp?a[i]:temp;
    }
    for(int j=0;j<m;++j){
      flag+=b[j]<temp?1:0;
    }
    System.out.println(flag<0?"War":"No War");
  }
}