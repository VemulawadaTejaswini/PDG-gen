import java.util.Scanner;

class hello{
	public static void main(String arg[]){
    	Scanner input = new Scanner(System.in);
      	int num = input.nextInt();
      	System.out.println(odd(num));
    }
  	static double odd(int num) {
        double oddNum = (num + 1)/2;
        double res = oddNum/num;
        return res;
    }
}