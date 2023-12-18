import java.util.Scanner;

class Main{
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	int x,a;
	x = sc.nextInt();
	a = sc.nextInt();

	if(x < a){
	    System.out.println(0);
	}else{
	    System.out.println(10);
	}
    }
}
	
