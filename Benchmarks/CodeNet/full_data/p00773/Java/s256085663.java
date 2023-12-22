import java.util.Scanner;



public class Main {


  public static void main(String[] args) {

	  Scanner sc=new Scanner(System.in);
	  int x,y,xx,yy,a,b;
	  int p,q;
	  int m=0;
	  int N=100000;
	 
	  
	  for(int n=0;n<N;n++){
	  
	  
		  
		 
		   a=Integer.parseInt(sc.next());
		   b=Integer.parseInt(sc.next());
		   int s=Integer.parseInt(sc.next());
		   m=0;
		   if(a==0&&b==0&&s==0){
			   break;
		   }
		   else{
			   for(int i=0;i<s;i++){
			   for(int j=0;j<s;j++){
				   
			   
		   if(i+j==s){
	  x=i;
	  y=j;
	  if(x+y==s){
	
	  p=(int)(100*x/(100+a));
	  q=(int)(100*y/(100+a));
	 
	  if((100*x%(100+a))!=0){
		  p=p+1;
	  }
	  if((100*y%(100+a))!=0){
		  q=q+1;
	  }
	 
				 xx=(int)(p*((b+100)))/100;
				 yy=(int)(q*((b+100)))/100;
				
		if(xx+yy>m){
			
			m=xx+yy;
		}
	  }	  
	  }  
	  }
	 }
			   System.out.println(m);
}
		  
	  }
	
	  
  }
}