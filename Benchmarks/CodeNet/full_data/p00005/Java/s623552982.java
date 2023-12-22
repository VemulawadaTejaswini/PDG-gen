import java.util.Scanner;

class Main {

    static int gcd(int a, int b){
	if(a < b){
	    int temp = a;
	    a = b;
	    b = temp;
	}
	
	while(b != 0){
	    int temp = b;
	    b = a % b;
	    a = temp;
	}
	return a;	    
    }

    static int lcm(int a, int b){
	a /= gcd(a, b);
	return a * b;
    }
    
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	while(stdin.hasNextInt()){
	    int a = stdin.nextInt();
	    int b = stdin.nextInt();
	    System.out.println(gcd(a, b) + " " + lcm(a, b));
	}
    }
}