import java.util.io
import java.util.Scanner
import java.lang.String
public Class Main{
	public static void main(str [] args){
    Scanner sc= new Scanner(System.in);
    String str= sc.next();
    if(str.endsWith('s'))
    {
    str=str+'es';
    }
    else
    {
    str=str+'s';
    }
    System.out.println(str);
    }
}