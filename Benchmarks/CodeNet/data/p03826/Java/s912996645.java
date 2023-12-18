import java.util.*;
class rect
{
int ar[]=new int[4];
public void input()
{
    int i;
    Scanner read=new Scanner(System.in);
    System.out.println("enter");
    for(i=0;i<4;i++)
    {
        ar[i]=read.nextInt();
    }
}
public int recto()
{
int a=(ar[0]*ar[1]);
int b=(ar[2]*ar[3]);
if(a>b)
return a;
else if(a<b)
return b;
else
return a;
}
public static void main(String[] args)
{
    rect obj=new rect();
obj.input();
obj.recto();
}
}