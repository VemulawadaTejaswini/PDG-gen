import java.util.Scanner;
import java.util.Date;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int debt=100000;
	double temp;

	int n=sc.nextInt();
	
  	for(int i=0;i<n;i++){
	    temp=debt*1.05;
	    if(temp%1000>0){
		temp=temp-temp%1000+1000;
	    }
	    debt=(int)temp;
    	}
	System.out.println(debt);
    }
}