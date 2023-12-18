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
 
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	int n = 999;
    	int[] f = new int[n];
    	f[0] = 1;
    	
    	for(int i = 1; i < n; i++){
    		f[i] = f[i-1] + (i+1);
    	}
    	
    	int d = b - a;
    	int ans = 0;
    	for(int i = 2; i < n; i++){
    		if(f[i] - f[i-1] == d){
    			ans = f[i] - b;
    			break;
    		}
    	}
    	
    	System.out.println(ans);
	}
}