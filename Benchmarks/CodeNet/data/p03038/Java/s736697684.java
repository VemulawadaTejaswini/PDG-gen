import java.util.Scanner;
import java.util.*;
import java.lang.*; 
import java.util.regex.Pattern;
import java.text.DecimalFormat;
import java.util.stream.IntStream;
public class Main{ 
static int isOn(int S, int j) { return S & (1 << j); }
static int a,b,c;
static int[] dp=new int[4010];
static final int INF=1000000;
static boolean[] prime=new boolean[1000100]; 
public static void main(String[] args)
{ 
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
int m=scanner.nextInt();
int[] b=new int[m];
int[] c=new int[m];
PriorityQueue<Integer> p = new PriorityQueue<Integer>();
for(int i=0;i<n;i++)p.add(scanner.nextInt());
for(int i=0;i<m;i++)
{
    b[i]=scanner.nextInt();
    c[i]=scanner.nextInt();
}
for(int i=0;i<m;i++)
{   int count=0;
    while(b[i]>0)
    {
        if(c[i]>p.peek()){p.poll();count++;}else break;
        b[i]--;
    }
    for(int j=0;j<count;j++)p.add(c[i]);
}
long sum=0;
for(int i=0;i<n;i++)sum+=p.poll();
System.out.print(sum);
}
}
