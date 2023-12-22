import java.util.*;
class Main{
 static public void main(String args[]){
  Scanner sc=new Scanner(System.in); 
   boolean flag=false;
   int a,b,c,d;
   a=sc.nextInt();
   b=sc.nextInt();//kougeki
   c=sc.nextInt();
   d=sc.nextInt();//kougeki
   
   while(true){
     c-=b;
	 	 if(c<0){
	 	flag=false;break;
		}
     a-=d;
	    if(a<0){
	 	flag=true;break;
		}
	 else continue;
   }
   
   if(flag==true)System.out.println("No");
   else System.out.println("Yes");
 }
}