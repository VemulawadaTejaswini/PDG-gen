import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner s= new Scanner(System.in);
      	String str=s.next();
      //System.out.println(str);
      	int a=0;
       	int b=0;
      	int j=1;
      	char sym='+';
      	for(int i=0;i<str.length();i++){
          	if(str.charAt(i)=='+' || str.charAt(i)=='-'){
            	 j=i;
              sym=str.charAt(i);
              break;
            }
        	a=a*10+str.charAt(i)-'0';
              
        }
         for(int i=j+1;i<str.length();i++){
          	
        	b=b*10+str.charAt(i)-'0';
        }
      if(sym=='+'){
      	System.out.println(a+b);	
      }else{
      System.out.println(a-b);}
      
    }
}
