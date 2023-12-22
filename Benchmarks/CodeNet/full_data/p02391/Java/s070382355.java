import java.util.Scanner;
class AOJ_BC1{
    Scanner sc = new Scanner(System.in);
	int a;
	int b;
	void bc1(){
		a = sc.nextInt();
	    b = sc.nextInt();
	
		if(a<b){
			System.out.println(a+" < "+b);
		}else{
			if(a>b){
				System.out.println(a+" > "+b);
		    }else{
				System.out.println(a+" == "+b);
		    }
		}
	}
		
	public static void main(String[]agrs){
		new AOJ_BC1().bc1();
	}
}