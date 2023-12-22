import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);

		char[] input = sc.next().toCharArray();
		
		int ans = 0;
		
		
		for(int i = 0; i < input.length/2; i++){
			if(input[i] == '(' && input[input.length - i - 1] == ')'){
				continue;
			}else if(input[i] == ')' && input[input.length - i - 1] == '('){
				continue;
			}else if(input[i] == '(' && input[input.length - i - 1] == '('){
				ans++;
			}else if(input[i] == ')' && input[input.length - i - 1] == ')'){
				ans++;
			}else if(input[i] != input[input.length - i - 1]){
				ans++;
			}
		}
		
		if(input.length % 2 == 1){
			if(input[input.length/2] != 'i' && input[input.length/2] != 'w'){
				ans++;
			}
		}
		
		System.out.println(ans);
	}

}