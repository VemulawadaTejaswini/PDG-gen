import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
	Scanner sc  = new Scanner(System.in);
        
    int cnt = 0;

	int  i1 = 0 ,i2 = 0, i3 = 0;
	long L1 = 0, L2 = 0, L3 = 0;
	char ch;
	String str = "";
		

    String s1 = sc.next();


     
    str = s1.replaceAll("dream", "");
    
   //  System.out.println(str);
     
    str = str.replaceAll("eraser", "");
    
  //   System.out.println(str);
     
         str = str.replaceAll("dreamer", "");
    
//     System.out.println(str);
     
    str = str.replaceAll("erase", "");
    
 //    System.out.println(str);
 //     System.out.println();


    if(str.length()>0)    System.out.print("NO");
    else  System.out.print("YES");
        System.out.println();
	}
        
}