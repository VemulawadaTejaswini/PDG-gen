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
int count=0;
int[] a=new int[n+1];
for(int i=0;i<m;i++)
{
    int l=scanner.nextInt();
    int r=scanner.nextInt();
    for(int j=l;j<=r;j++)a[j]++;
}
for(int i=1;i<n+1;i++)
{
    if(a[i]==m)count++;
}
System.out.print(count);
}
}
