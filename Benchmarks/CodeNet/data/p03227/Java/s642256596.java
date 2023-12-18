import java.util.Scanner;

public class ReverseString { 
   
  public static void main (String args[]){ 
	  String a[]=new String[10];
	  System.out.println("请输入字符串:");
	  Scanner sc=new Scanner(System.in);
	  for(int i=0;i<=a.length-1;i++){
		  a[i]=sc.next();
	  }
	  if(a.length==1)
		  System.out.println(a[0]+a[1]);
	  else {
		  for(int i=a.length-1;i<=0;i--)System.out.println(a[i]);
	  }
    } 
}