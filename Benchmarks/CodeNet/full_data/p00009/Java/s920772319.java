import java.io.*;
public class Main {
public static void main(String []args)throws IOException
{
BufferedReader var=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=var.readLine())!=null)
{
    int x=Integer.parseInt(line);
  int s=0;
    int sz = 999999; // registra numero primos desde 0 a 999
 boolean [] criba=new boolean[sz];// Inicia criba de Erathostenes
    	criba[0] = criba[1] = true;
    	int lim= (int)Math.sqrt(sz);
    	for(int i=2;i<lim;i++)
        	if(!criba[i])
            	for(int j=i*i;j<sz;j+=i)
                	criba[j]=true;

        for(int i = 2; i <=x; i++)
if(!criba[i])
s++;

System.out.println(s);
}}}