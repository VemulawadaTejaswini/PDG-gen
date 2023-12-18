import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = (double)sc.nextInt();
		double b = (double)sc.nextInt();
		double average = (a+b)/2;
		if(average-(int)average>=0.5){
			System.out.println((int)average+1);
		}else{
			System.out.println((int)average);
		}
	}
}