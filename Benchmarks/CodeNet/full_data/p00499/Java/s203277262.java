import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int x[]=new int[5];
for(int i=0;i<5;i++)
{
x[i]=Integer.parseInt(input.readLine());
}
int i=((x[1]%x[3]==0)?x[1]/x[3]:x[1]/x[3]+1);
int j=((x[2]%x[4]==0)?x[2]/x[4]:x[2]/x[4]+1);

System.out.println(x[0]-((i>j)?i:j));
}
}