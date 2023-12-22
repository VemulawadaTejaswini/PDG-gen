import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		long a = 1;
		long nums[] = new long[size];
		for(int i = 0; i < size; i++){
			nums[i] = sc.nextLong();
			if(nums[i] == 0){a = 0;}
		}
		try{
			for(int i = 0; i < size; i++){
				if(a == 0){break;}
					a *= nums[i];
					String str = "" + a;
					if(str.length() > 18){
						if(str.equals("1000000000000000000")) continue;
						a = -1; break;
					}
			}
		} catch(Exception e){
			a = -1;
		}
		System.out.println(a);
	}
}