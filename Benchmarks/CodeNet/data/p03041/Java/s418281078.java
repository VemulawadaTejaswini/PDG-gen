import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		String S = sc.next();
		char[] arr = S.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++){
			if(i == K - 1){
				sb.append((char) (arr[i] - 'A' + 'a'));
			}else{
				sb.append(arr[i]);
			}
		}
		
		System.out.println(sb.toString());
	}
}