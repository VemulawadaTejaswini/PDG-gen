import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		while(true){
			int temp = sc.nextInt();
			if(temp==0)break;
			else System.out.println(ans(temp));
		}
	}
	public static int ans(int temp){
		int j = 1;
		int count = 0;
		for(int i=2;true;i++){
			j += i;
			if(temp<j)break;
			if((temp-j)%i == 0){
				count++;
			}
		}
		return count;
	}
}