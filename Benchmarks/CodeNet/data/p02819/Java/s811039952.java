import java.util.*;
class PrimeNumbers{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
     if(2<=x<=100000){
	  	if(x/x==1&&x/1==x){
	  		System.out.println(x);
		}
		else{
		  	for(int i=x;i/i==1&&i/1==i;i++){
			  	System.out.println(i);
			  }
		}
	 }
	 else
	 {
	 	System.out.println("Watch out for overflows");
	 }
  }
}
             