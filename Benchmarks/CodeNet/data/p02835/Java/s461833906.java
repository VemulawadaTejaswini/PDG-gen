	
import java.util.Scanner;
	publicclassMain{
	publicstaticvoid main(String[] args){
	Scanner sc =newScanner(System.in);
	int a = sc.nextInt();
	int b =sc.nextInt();
	int c =sc.nextInt();
	if(a+b+c>=22){
	System.out.println("bust");
	}elseif(a+b+c<=21){
	System.out.println("win");
	}
	}
	}



