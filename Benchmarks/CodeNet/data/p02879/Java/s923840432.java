import java.io.*;
import java.util.*;
public class MainClass{

public static void main(String arg[]){

	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();

	if(a+b>19)
	System.out.println(a*b);
	else
	System.out.println("-1");
	}
}

