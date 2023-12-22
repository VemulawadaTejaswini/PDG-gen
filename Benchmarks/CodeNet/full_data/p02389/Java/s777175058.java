import java.util.Scanner;

class Main{
    static int area(int a, int b){
	return a * b;
    }
    static int surr(int a, int b){
	return (2 *(a + b));
    }

    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int x = stdIn.nextInt();
	int y = stdIn.nextInt();
	System.out.println(area(x , y) + " " + surr(x , y));
    }
}