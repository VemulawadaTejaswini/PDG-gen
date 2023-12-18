import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//B
		int N = sc.nextInt();
		String W;
		char tmp = 'a';
		boolean flag = true;
		for(int i = 0 ; i < N ; i++){
			W = sc.next();
			if(i > 0){
				if (tmp != W.charAt(0)){
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
