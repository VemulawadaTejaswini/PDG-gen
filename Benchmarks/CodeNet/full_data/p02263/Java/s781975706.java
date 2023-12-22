import java.util.*;

import java.lang.Object;





public class Main{	

	public static void main(String[] args) {

		int i,flag,temp;

		char c;

		Deque<Integer> stack = new ArrayDeque<Integer>();

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();



		flag = 0; temp = 0;

		for(i=0;i<str.length();i++){

			c = str.charAt(i);

			if(c>='0'&&c<='9'){

				if(flag==0){

					stack.push(c-'0');

				}else{

					stack.push(10*stack.pop()+c-'0');

				}

				flag = 1;

			}

			else if(c=='+'){

				stack.push(stack.pop()+stack.pop());

			}

			else if(c=='-'){

				stack.push(-stack.pop()+stack.pop());

			}

			else if(c=='*'){

				stack.push(stack.pop()*stack.pop());

			}

			else{

				flag = 0;

			}

		}

		System.out.println(stack.pop());

	}

}