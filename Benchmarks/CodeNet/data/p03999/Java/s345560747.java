import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] strs = null;

		String str = sc.next();

		int pattern = 2;
		for(int i = 1;i < str.length();i++){
			pattern = pattern * 2;
		}

		if(str.length()==1){
			System.out.println(str);
		}else{
			System.out.println(str);
		}

	}
}