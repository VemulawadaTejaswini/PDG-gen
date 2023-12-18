import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int valLen = String.valueOf( num ).length(); 
		System.out.print(findMin(num, (long) Math.pow(10,valLen+1)));
//		int returnNum = 0;
//		System.out.println(digitSum(num));
//		if(num %9 ==0){
//			returnNum = digitSum(num);
//		}else if(num %3==0){
//			returnNum = findMin(num, 3);
//		}else{
//			returnNum = findMin(num, 9);
//		}
//		System.out.print(returnNum);
	}
	
	public static int findMin(int num, long times){
		int min = Integer.MAX_VALUE;
		for (long i = 1; i <= times; i++) {
			int digitSum= digitSum(num*i);
			if(min > digitSum){
				min = digitSum;
			}
		}
		return min;
	}
	
	public static int digitSum(long num){
		int sum=0;
		String str =  String.valueOf(num);
		for(int i=0; i< str.length(); i++){
			sum += str.charAt(i)-'0';
			}
		return sum;
	}

}
