import java.util.Scanner;

class Hello{
	public static void main(String arg[]){
    	Scanner input = new Scanner(System.in);
      	int num = input.nextInt();
      	odd(num);
    }
  	static void odd(int num) {
    	int oddNum = (num + 1)/2;
      	float res = oddNum/num;
    }
}