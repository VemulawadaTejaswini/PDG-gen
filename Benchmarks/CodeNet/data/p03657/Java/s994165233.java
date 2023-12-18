import java.io.*;
import java.util.*;
import java.lang.*;
import static java.lang.System.*;
public class Main
{
public static void main (String args[]) throws Exception
{
	Scanner sc=new Scanner(in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if((a+b)%3==0 || a%3==0 || b%3==0)
    out.println("Possible");
    else
    out.println("Impossible");


}
}


class Berland
{
char ch;
int pos;
public Berland(int a,char b)
{
ch=b;
pos=a;
}
}
class ChComparator implements Comparator<Berland>
{
public int compare(Berland f1,Berland f2)
{
if(f1.ch==f2.ch)
return 0;
if(f1.ch<f2.ch)
return -1;
return 1;
}
}
