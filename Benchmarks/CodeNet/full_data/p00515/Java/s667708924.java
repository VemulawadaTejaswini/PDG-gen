import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int sum=0;
for(int i=0;i<5;i++)
{
int x=Integer.parseInt(input.readLine());
if(x<40)
{
sum+=40;
continue;
}
sum+=x;
}
System.out.println(sum/5);
}
}