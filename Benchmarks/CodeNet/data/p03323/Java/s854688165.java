import java.util.Scanner;
public class Main{
  
  public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
    String str1 = scan.next();
    String str2 = scan.next();

 	int a = Integer.parseInt(str1);
    int b = Integer.parseInt(str2);
    
    if(a < b){
      int tmp = b;
      b = a;
      a = tmp;
    }
    
      if(a<0 || a>8 || b<0 || b>8 || a+b > 16)
        System.out.println(":(");
	  else
        System.out.println("Yay!");
    }
}