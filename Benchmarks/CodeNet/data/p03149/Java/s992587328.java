import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int[] line = new int[4];
		line[0] = sc.nextInt();
		line[1] = sc.nextInt();
		line[2] = sc.nextInt();
		line[3] = sc.nextInt();

		String ans;
		if(!isIn(line, 1)){
			ans = "NO";
		}else if(!isIn(line, 9)){
			ans = "NO";
		}else if(!isIn(line, 7)){
			ans = "NO";
		}else if(!isIn(line, 4)){
			ans = "NO";
		}else{
			ans ="YES";
		}
		
		System.out.println(ans);
	}
	
	public static boolean isIn(int[] line,int x){
		for(int n=0; n<4; n++){
			if(line[n]==x){
				line[n]=0;
				return true;
			}
		}
		return false;
	}

}
