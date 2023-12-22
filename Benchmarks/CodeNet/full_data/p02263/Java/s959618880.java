
import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s = sc.nextLine();
		char[] str = s.toCharArray();
		int len = s.length();
		
		Stack staNum = new Stack();
		Stack staOpr = new Stack();
		
		int num = 0;
		for(int i=0;i<len;i++) {
			num = 0;
			boolean f = false;
			while(i<len && str[i]<='9' && str[i]>='0') {
				num *= 10;
				num += str[i] - '0';
				i++;
				f = true;
			}
			if(f) {
				i--;
				staNum.push(num);
			}else if(str[i]=='+' || str[i]=='-' || str[i]=='*' || str[i]=='/'){
				int b = (int)staNum.pop();
				int a = (int)staNum.pop();
				switch(str[i]) {
					case '+': staNum.push(a + b); break;
					case '-': staNum.push(a - b); break;
					case '*': staNum.push(a * b); break;
					case '/': staNum.push(a / b); break;
					default: break;
				}
			}
/*			if(!staNum.isEmpty()) {
				System.out.println("sta.top(): " + staNum.top());
			}*/
		}
		System.out.println((int)staNum.pop());
	}
}
class Stack {
	Object[] value = new Object[200];
	int index = 0;
	
	public void push(Object o) {
		value[index++] = o;
	}
	
	public Object pop() {
		return value[--index];
		
	}
	
	public Object top() {
		return value[index-1];
	}
	
	public boolean isEmpty() {
		return index == 0;
	}
}

