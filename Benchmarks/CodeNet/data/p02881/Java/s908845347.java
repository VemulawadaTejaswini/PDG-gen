import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String str=sc.next();      	
		Long number=Long.parseLong(str);
      	Long a= new Long(0),b= new Long(0);
      	for(int i=1;i<=9;i++)
        {
          if(number%i==0)
          {           
            a=Long.valueOf(i-1);          
            b=Long.valueOf((number/i)-1);
          }
        }      
        System.out.println(a+b);
    }
}