import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
	Scanner sc  = new Scanner(System.in);
        
    int cnt = 0;

	int  i1 = 0 ,i2 = 0, i3 = 0;
	long L1 = 0, L2 = 0, L3 = 0;
	char ch;
	String str = "0";
		

    String s1 = sc.next();

    str = str.replaceAll("dreamer", "");
    str = s1.replaceAll("dream", "");
    str = str.replaceAll("eraser", "");
    str = str.replaceAll("erase", "");


    if(str.length()>0)    System.out.print("NO");
    else  System.out.print("YES");
        System.out.println();
	}
        
}