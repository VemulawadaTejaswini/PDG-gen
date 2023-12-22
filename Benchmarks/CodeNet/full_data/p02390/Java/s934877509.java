 import java.util.Scanner;
public class Main{ 
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int h,m,s=0;
      int S = sc.nextInt();
       h=S/3600;
       m=(S%3600)/60;
       s=S%60;
    
      
 
      System.out.println(h+":"+m+":"+s);
		 sc.close();

 
    }
}
