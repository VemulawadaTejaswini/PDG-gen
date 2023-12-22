import java.util.Scanner;

class Main{
    static int hour(int x){
	return (x /(60 * 60));
    }
    static int minu(int x){
	return((x % (60 * 60)) / 60);
    }
    static int sec(int x){
	return(x % 60);
    }
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int x = stdIn.nextInt();
	System.out.println(hour(x) + ":" + minu(x) + ":" + sec(x));
    }
    
}