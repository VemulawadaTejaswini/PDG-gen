import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int count = 0;
      	int target = 0;
		String ans = "";
		if (num1 < num2){
          	target = num1;
			count = num2;
		}else{
          	target = num2;
			count = num1;
		}
		
		for (int i = 0; i < count; i++){
			ans += target;
		}
		System.out.println(ans);
	}

}