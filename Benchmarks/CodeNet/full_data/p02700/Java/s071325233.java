import java.util.*;
class Main{
 static public void main(String args[]){
  Scanner sc=new Scanner(System.in); 
   boolean flag;
   int a,b,c,d;
   a=sc.nextInt();
   b=sc.nextInt();//kougeki
   c=sc.nextInt();
   d=sc.nextInt();//kougeki
   
   while(true){
  	System.out.println("a:"+a+"c:"+c);
     c-=b;
	 a-=d;
	 
	 	if(c<=0){
	 	flag=true;break;
		}

	    if(a<=0){
	 	flag=false;break;
		}
		
	 else continue;
   }
   
   if(flag==true)System.out.println("Yes");
   else System.out.println("No");
 }
}