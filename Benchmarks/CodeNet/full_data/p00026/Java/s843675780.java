import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
String str;
int xy[][]=new int[14][14];
int count=0,max=0;
while((str=input.readLine())!=null)
	{
	String str_ary[]=str.split(",");
	int x,y,size;
	x=Integer.parseInt(str_ary[0]);
	y=Integer.parseInt(str_ary[1]);
	size=Integer.parseInt(str_ary[2]);
	if(size==1)
	{
	xy[x+2][y+2]++;
	xy[x-1+2][y+2]++;
	xy[x+1+2][y+2]++;
	xy[x+2][y+1+2]++;
	xy[x+2][y-1+2]++;
	}
	if(size==2)
	{
	xy[x+2][y+2]++;
	xy[x-1+2][y+2]++;
	xy[x+1+2][y+2]++;
	xy[x+2][y+1+2]++;
	xy[x+2][y-1+2]++;
	xy[x+1+2][y+1]++;
	xy[x-1+2][y-1+2]++;
	xy[x-1+2][y+1+2]++;
	xy[x+1+2][y+1+2]++;
	}
	if(size==3)
	{
	xy[x+2][y+2]++;
	xy[x-1+2][y+2]++;
	xy[x+1+2][y+2]++;
	xy[x+2][y+1+2]++;
	xy[x+2][y-1+2]++;
	xy[x+1+2][y+1+2]++;
	xy[x+1+2][y-1+2]++;
	xy[x-1+2][y+1+2]++;
	xy[x-1+2][y-1+2]++;
	xy[x+2+2][y+2]++;
	xy[x+2][y+2+2]++;
	xy[x-2+2][y+2]++;	
	xy[x+2][y-2+2]++;
	}	
}
for(int i=2;i<12;i++)
	{
		for(int j=2;j<12;j++)
		{
		if(xy[i][j]==0)		
		count++;
		if(max<xy[i][j])max=xy[i][j];			
		}
	}	
System.out.println(count);
System.out.println(max);
}
}