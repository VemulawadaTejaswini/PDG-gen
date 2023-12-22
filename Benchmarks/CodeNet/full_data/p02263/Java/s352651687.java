import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		IntStack stack=new IntStack();

		for(int i=0;i<str.length;i++){
			try{stack.push(Integer.parseInt(str[i]));
			
			}catch(NumberFormatException e){
				int num=keisan(stack.pop(),stack.pop(),str[i].charAt(0));
				stack.push(num);
				}
			}System.out.println(stack);
		}

	
	static int keisan(int num1,int num2,char operator){
		switch(operator){
		case '+':num1=num2+num1;break;
		case '-':num1=num2-num1;break;
		case '*':num1=num2*num1;break;
		case '/':num1=num2/num1;break;
		}
		return num1;
	}

}

class IntStack {
	private int pointer=-1;
	ArrayList<Integer> stack;

	IntStack(){
		stack=new ArrayList<Integer>();

	}
	public void push(int a){
		stack.add(a);
		pointer++;
	}
	public int pop(){
		int a=stack.get(pointer);
		stack.remove(pointer);
		pointer--;
		return a;
	}
	public String toString(){
		StringBuilder stb=new StringBuilder();
		for(int i:stack)stb.append(i);
		return stb.toString();

	}

}