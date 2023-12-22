import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(System.out);
		try {
			//入力受け取り
			String input = br.readLine();

			//変数定義
			Stack<String> stack1 = new Stack<>(); // 水たまりの総面積を求めるためのスタック
			Stack<String> stack2 = new Stack<>(); // 水たまりの左の場所
			Stack<String> stack3 = new Stack<>(); // 水たまりの各面積
			int sum = 0; //総面積
		//	boolean flag = true;
			//String left;
			//String dummy = "dummy"; //stack用dammy
			//stack2.push(dummy);
			
			//水たまりの総面積処理
			for(int i = 0; i < input.length(); i++) {
				
				if(input.substring(i, i+1).equals("\\")){
					stack1.push(String.valueOf(i));

				} else if(input.substring(i, i+1).equals("/")) {
					try {
					String left = stack1.pop();
					int sum1 = 1 + (i - Integer.parseInt(left) - 1);
					sum += sum1;
					stack2.push(left); //各水たまりの左の位置保存
					stack3.push(String.valueOf(sum1)); //各水たまりの面積保存
				//	System.out.println(stack3 + " +" + sum1);
					
					//各水たまりの統合判定
					while(stack2.size() > 1) {
						String leftnowS = stack2.pop();
						int leftnowN = Integer.parseInt(leftnowS);
						int leftprev = Integer.parseInt(stack2.peek());
						
						if(leftnowN < leftprev) {
							stack3.push(String.valueOf(Integer.parseInt(stack3.pop()) + Integer.parseInt(stack3.pop())));
						//	System.out.println("統合後: " + stack3);
							stack2.pop();
							stack2.push(leftnowS);
						/*	String l = stack2.pop();
							String m = stack2.pop();
							String n = stack2.pop();
							if(Integer.parseInt(m) > Integer.parseInt(n)) {
							stack2.pop();
						}*/
							
						} else {
							stack2.push(leftnowS);
							break;
						}
					}		
					
					}catch(EmptyStackException e) {
					//	System.out.println("error");
						//System.out.println(stack3.peek());
					}
					}
			}
			System.out.println(sum); //水たまりの総面積出力
			
			//各水たまり出力
			System.out.print(stack3.size());
			if(stack3.size() > 0) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
				try {
					String[] a = new String[stack3.size()];
					for(int i = 0; i < a.length; i++) {
						a[i] = stack3.pop();
					}
					for(int i = a.length - 1; i >= 0; i--) {
				System.out.print(a[i]);
				if(i > 0) {
				System.out.print(" ");
				} else {
					System.out.println();
					break;
				}
					}
				} catch(EmptyStackException e) {
					System.out.println("error3");
				}
			
			
		} catch(IOException e) {
			System.out.println("error2");

		}


	}
	
	}

