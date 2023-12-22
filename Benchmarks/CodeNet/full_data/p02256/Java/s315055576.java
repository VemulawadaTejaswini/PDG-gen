import java.util.Scanner;

class Gcd{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a, b, gcd = 0;

	a = scan.nextInt();
	b = scan.nextInt();

	if(a > b) gcd = b;
        else if(a < b) gcd = a;

	while(true){
	    if(((a % gcd) == 0) && ((b % gcd) == 0)) break;
	    else gcd--;
	}

	System.out.println(gcd);
	
    }
}