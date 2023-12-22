import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int count = 0;
		int s = 0;
		int i = 7;
		
		if(k % 2 == 0){
				System.out.println(-1);
		}else{
			while(true){
				s = (s * 10) + 7;
				count++;
				if(s % k == 0){
					System.out.println(count);
					break;
				}
			}
		}
	}
}