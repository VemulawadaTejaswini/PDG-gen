import java.io.*;
public class Main {
public static void main(String []args)throws IOException
{
BufferedReader var=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(var.readLine());
int p=0;
for(int x=n;x>1;x--)
{
int b=0;
    for(int c=x;c>0;c--)
{
if(x%c==0)
{
b++;
}
}
if(b==2)
    p++;
}

System.out.println(p);
}
}