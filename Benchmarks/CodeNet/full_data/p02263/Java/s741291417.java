import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x;
	String s; 
	Stack stack = new Stack();
	s = sc.nextLine();
	char[] str = s.toCharArray();
	int len = s.length();
	int num = 0;
	for(int i = 0;i < len;i++){
	    num = 0;
	    boolean f = false;
	    while(i < len && str[i] <= '9' && str[i] >= '0'){
		num *= 10;
		num += str[i] - '0';
		i++;
		f = true;
	    }
	    if(f){
		i--;
		stack.push(num);
	    }else if(str[i]=='+' || str[i]=='-' || str[i]=='*' || str[i]=='/'){
		int b = (int)stack.pop();
		int a = (int)stack.pop();
		switch(str[i]) {
		case '+': stack.push(a + b); break;
		case '-': stack.push(a - b); break;
		case '*': stack.push(a * b); break;
		case '/': stack.push(a / b); break;
		default: break;
		}
	    }
	}
	System.out.println((int)stack.pop());
    }
}


class Stack{
    private int top = 0;
    private int[]  S = new int[200]; 
    private static final int MAX = 10;
    public void initialize(){
	top = 0;
    }
    public boolean isEmpty(){
	return top == 0;
    }
    public boolean isFull(){
    	return top >= MAX - 1;
    }
    public void push(int x){
    	/*if(isFull()){
	    System.out.println("Stack over flow");
    	}*/
    	top++;
    	S[top] = x;
    }
    public int pop(){
	/*if(isEmpty()){
	    throw new RuntimeException("Stack under flow");
	}*/
	top--;
	return S[top + 1];
	
    }
    
}
