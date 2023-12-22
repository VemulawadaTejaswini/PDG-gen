import java.io.*;
class BubbleSort{

public static void main(String[] args) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int[] arr=new int[n];

String[] ip=br.readLine().split(" ");
for(int i=0;i<n;i++)
arr[i]=Integer.parseInt(ip[i]);
int swap=0;
for(int i=0;i<n-1;i++)
for(int j=0;j<n-1-i;j++)
{
if(arr[j]>arr[j+1])
{
arr[j]=arr[j]+arr[j+1];
arr[j+1]=arr[j]-arr[j+1];
arr[j]=arr[j]-arr[j+1];
swap++;
}
}
for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");
System.out.println();
System.out.print(swap);
}
}