import java.util.*;
import java.util.Scanner;
import java.lang.String;
public class Main{
	public static void main(Str [] args){
    Scanner sc= new Scanner(System.in);
    String str1= sc.next();
    if(str1.endsWith("s"))
    {
    str1=str1+"es";
    }
    else
    {
    str1=str1+"s";
    }
    System.out.println(str1);
    }
}