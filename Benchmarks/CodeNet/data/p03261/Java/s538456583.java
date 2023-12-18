import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//B
		int N = sc.nextInt();
		String W;
		char tmp = 'a';
		ArrayList<String> list = new ArrayList<>();
		boolean flag = true;
		for(int i = 0 ; i < N ; i++){
			W = sc.next();
			list.add(W);
			if(i > 0){
				if (tmp != W.charAt(0) || list.indexOf(W) != -1){
					flag = false;
					//System.out.println(i);
				}
			}
			tmp = W.charAt(W.length() -1);
		}
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}