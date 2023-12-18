import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int prev = 0;
		String ans = "Yes";
		boolean end = false, downNext = false;
		for(int i = 0; i < num; i++){
			int height = sc.nextInt();
			if(height < prev){
				if(!end){
					end = true;
					downNext = true;
				}
				else{
					ans = "No";
					break;
				}
			}
			else prev = height;
		}
		System.out.println(ans);
	}
}


