import java.util.Scanner;
class Main{
    public static void main(String[] args){
	int x,y;
	Scanner scanner = new Scanner(System.in);
	x = scanner.nextInt();
	y = scanner.nextInt();
	System.out.println(calc_gcd(x,y));
    }
    public static int calc_gcd(int x,int y){
        
	if(x < y){
	    int tmp = x;
	    x = y;
	    y = tmp;
	}
	if(x % y == 0) return y;
	return calc_gcd(y,x%y);
    }
}


