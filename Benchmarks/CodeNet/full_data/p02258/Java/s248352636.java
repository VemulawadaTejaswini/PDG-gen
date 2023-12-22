import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int b = sc.nextInt();
		int max = b;//3
		int out = 0;
		int min = b;//3
		boolean h = false;
		for(int i = 1;i <= size - 1;i++){
			int num = sc.nextInt();//2
			if (max < num){
				max = num;
				h = true;
			}else if(min > num){
				b = max;//3
				max = 0;
				min = num;
				h = true;
			}
		}
		if(h){
			out = max - min;
		}else{
			out = min - b;
		}
		System.out.println(out);
	}
	
	
}