import java.util.*;
class Atcoder{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int flag = 0,rem = 0;
      if(n>=100&&n<=999){
		while(n!=0){
			rem = n%10;
			if(rem == 7){
				flag = 1;
				break;
			}
			n /=10;
		}
      }
		if(flag == 1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}