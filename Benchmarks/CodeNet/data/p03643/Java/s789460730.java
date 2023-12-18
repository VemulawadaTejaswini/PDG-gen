import java.util.*;
class Main{
	public static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int num = sc.nextInt();
		for(int i=1; i<=num; i++){
			if(count(i)>max){
				max = i;
			}
		}
		System.out.println(max);
	}

	public static int count(int num){
		if(num%2==0){
			num /= 2;
			count++;
			count(num);
		}
		return count;
	}
}