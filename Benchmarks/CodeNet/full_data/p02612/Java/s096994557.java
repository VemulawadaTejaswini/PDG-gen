import java.io.*;
class Payment
{
public static void main(String args[])throws IOException
{
int N;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
N=Integer.parseInt(br.readLine());
if(N%1000==0)
System.out.println(N%1000);
else
System.out.println(1000-(N%1000));
}
}