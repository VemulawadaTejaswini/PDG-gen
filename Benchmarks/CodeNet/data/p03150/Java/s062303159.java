import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		char[] input = sc.next().toCharArray();
		char[] keyence = {'k', 'e', 'y', 'e', 'n', 'c', 'e', '_'};
		int select_keyence = 0;
		int wrong_char=-1;
		boolean flag = true;
		String ans;
		for(int i=0; i<input.length; i++){
			if (input[i]!=keyence[select_keyence]){
				wrong_char=i;
				if (i-wrong_char>1)select_keyence=0;
			}else{
				select_keyence++;
			}
			
		}
		if(!(select_keyence==7))flag=false;
		
		if(!flag){
			ans = "NO";
		}else{
			ans ="YES";
		}
		
		System.out.println(ans);
	}

}
