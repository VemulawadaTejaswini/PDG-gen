import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	double x1,y1,x2,y2;
	String str[]=new String[4];
	str=input.readLine().split(" ");
	
	x1=Double.parseDouble(str[0]);
	y1=Double.parseDouble(str[1]);
	x2=Double.parseDouble(str[2]);
	y2=Double.parseDouble(str[3]);
	if(x1>x2 && y1>y2)
	    {
		System.out.println(Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2)));
	    }
	if(x2>x1 && y1>y2)
	    {
		System.out.println(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y1-y2),2)));
	    }
	if(x1>x2 && y2>y1)
	    {
		System.out.println(Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y2-y1),2)));
	    }
	if(x2>x1 && y2>y1)
	    {
		System.out.println(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
	    }
    }
}