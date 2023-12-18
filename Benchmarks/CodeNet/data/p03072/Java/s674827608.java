import java.util.Scanner;
import java.util.*;
import java.lang.*; 
import java.util.regex.Pattern;
import java.text.DecimalFormat;
import java.util.stream.IntStream;
public class Main{    
public static void main(String[] args)
{     
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
int count;
int c=1;
int[] a=new int[n];
for(int i=0;i<n;i++)
{
   a[i]=scanner.nextInt();
}
for(int i=1;i<n;i++)
{ count=0;
  for(int j=0;j<i;j++)
   if(a[i]>=a[j])count++;else break;
 if(count==i)c++;
}
System.out.println(c);
}
}




