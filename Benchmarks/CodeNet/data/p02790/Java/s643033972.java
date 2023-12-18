import java.util.*;
class Main{
	public static void main(String[]args){
    	Scanner in = new Scanner(System.in);
      	int a = in.nextInt(), b = in.nextInt();
      	String x = "", y = "";
      	for(int i = 0; i < a ;i++)
          x+=b;
      	for(int i = 0 ; i< b;i++)
          y+=a;
      	if(Integer.parseInt(x)>Integer.parseInt(y))
          System.out.println(x);
      	else
          System.out.println(y);
    }
}