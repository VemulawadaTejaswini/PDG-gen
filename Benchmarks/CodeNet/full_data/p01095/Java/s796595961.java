import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * 0.5 == 1.0/2
 * Integer.valueOf(char)はダメ、(String)
 */

public class Main {

	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true){
			int m = sc.nextInt();
	    	int n = sc.nextInt();
	    	if(m == 0 && n == 0) break;
	    	System.out.println(calc(m, n));
		}
	}
	
	public static int  calc(int m, int n){
		int[] prime = new int[500001];
		prime[0] = m;
		
		for(int i = 0; i < n; i++){
			int next = prime[i] + 1;
			while(true){
				boolean flag = true;
				for(int j = 0; j <= i; j++){
					if(next % prime[j] == 0){
						flag = false;
						break;
					}
				}
				if(flag){
					prime[i+1] = next;
					break;
				}else{
					next++;
				}
			}
		}
		
		
		return prime[n];
	}
}
