import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] c = sc.next().toCharArray();
    long sum = 0;
    long[] l = new long[c.length+1];
    long[] r = new long[c.length+1];
    for(int i=1;i<=c.length;i++)if(c[i-1]=='<')l[i]=l[i-1]+1;
    for(int i=c.length-1;i>=0;i--)if(c[i]=='>')r[i]=r[i+1]+1;
    for(int i=0;i<=c.length;i++)sum+=Math.max(l[i],r[i]);
    System.out.println(sum);
  }
}
