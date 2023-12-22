import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static final int SIZE = 100000;
	public static int[] queue = new int[SIZE + 1];
	public static int tp = 0;
	public static int bp = 0;
	
	public static int next_index(int index){
		return (index + 1) % SIZE;
	}
	
	public static int prev_index(int index){
		return (SIZE + index - 1) % SIZE;
	}
	
	public static void push(int x){
		queue[tp] = x;
		tp = next_index(tp);
	}
	
	public static int pop(){
		int old = bp;
		bp = next_index(bp);
		return queue[old];
	}
	
	public static int peek(){
		return queue[bp];
	}
	
	public static void del(){
		bp = next_index(bp);
	}
	
	public static int size(){
		return tp - bp;
	}
	
	public static boolean is_empty(){
		return tp == bp;
	}
	
	public static void clean(){
		tp = bp = 0;
	}
	
	public static final int ADD     = -1;
	public static final int SUB     = -2;
	public static final int MUL     = -3;
	public static final int DIV     = -4;
	public static final int KAKKO_L = -5;
	public static final int KAKKO_R = -6;
	
	
	public static interface Expr{
		public int eval(int mod);
	}
	
	public static class Inner implements Expr{
		Expr inner;

		public Inner(Expr inner) {
			super();
			this.inner = inner;
		}

		@Override
		public int eval(int mod) {
			return inner.eval(mod);
		}
		
		@Override
		public String toString(){
			return "(" + inner +  ")";
		}
	}
	
	public static class Plus implements Expr{
		Expr left, right;

		public Plus(Expr left, Expr right) {
			super();
			this.left = left;
			this.right = right;
		}

		@Override
		public int eval(int mod) {
			return (left.eval(mod) + right.eval(mod)) % mod;
		}
		
		@Override
		public String toString(){
			return left + "+" + right;
		}
	}
	
	public static class Minus implements Expr{
		Expr left, right;

		public Minus(Expr left, Expr right) {
			super();
			this.left = left;
			this.right = right;
		}

		@Override
		public int eval(int mod) {
			return (mod + left.eval(mod) - right.eval(mod)) % mod;
		}
		
		@Override
		public String toString(){
			return left + "-" + right;
		}
	}
	
	public static class Mul implements Expr{
		Expr left, right;

		public Mul(Expr left, Expr right) {
			super();
			this.left = left;
			this.right = right;
		}

		@Override
		public int eval(int mod) {
			return (left.eval(mod) * right.eval(mod)) % mod;
		}
		
		@Override
		public String toString(){
			return left + "*" + right;
		}
	}
	
	public static int mod_pow(int x, int p, int mod){
		if(p == 1){
			return x % mod;
		}else if(p == 0){
			return x == 1 ? 1 : 0;
		}
		
		if(p % 2 == 0){
			int ret = mod_pow(x, p / 2, mod);
			
			return (ret * ret) % mod; 
		}else{
			return (mod_pow(x, p - 1, mod) * x) % mod;
		}
	}
	
	public static class Div implements Expr{
		Expr left, right;

		public Div(Expr left, Expr right) {
			super();
			this.left = left;
			this.right = right;
		}

		@Override
		public int eval(int mod) {
			final int right_ret = right.eval(mod);
			
			if(right_ret == 0){
				throw new ArithmeticException("");
			}
			
			int inv = mod_pow(right_ret, mod - 2, mod);
			
			if(inv == 0){
				throw new ArithmeticException("");
			}
			
			return (left.eval(mod) * inv) % mod;
		}
		
		@Override
		public String toString(){
			return left + "/" + right;
		}
	}
	
	public static class Const implements Expr{
		int cons;
		
		public Const(int cons){
			this.cons = cons;
		}
		
		@Override
		public int eval(int mod){
			return cons;
		}
		
		@Override
		public String toString(){
			return cons + "";
		}
	}
	
	//+, -
	public static Expr parse_1(){
		Expr left = parse_2();
		
		if(left == null){
			return null;
		}
		
		//System.out.println("t");
		
		while(!is_empty()){
			if(!(peek() == ADD) && !(peek() == SUB)){
				return left;
			}
			
			int type = pop();
			Expr right = parse_2();
			
			if(type == ADD){
				left = new Plus(left, right);
			}else{
				left = new Minus(left, right);
			}
		}
		
		return left;
	}
	
	//*, /
	public static Expr parse_2(){
		Expr left = parse_3();
		
		if(left == null){
			return null;
		}
		
		while(!is_empty()){
			if(!(peek() == MUL) && !(peek() == DIV)){
				return left;
			}
			
			int type = pop();
			Expr right = parse_3();
			
			if(type == MUL){
				left = new Mul(left, right);
			}else{
				left = new Div(left, right);
			}
		}
		
		return left;
	}
	
	//primitive, ()
	public static Expr parse_3(){
		if(is_empty()){
			return null;
		}else if(peek() >= 0){
			return new Const(pop());
		}else if(peek() == KAKKO_L){
			del();
			Expr expr = parse_1();
			
			if(peek() == KAKKO_R){
				del();
				return new Inner(expr);
			}else{
				return null;
			}			
		}
		
		return null;
	}
	
	public static void add_stack(String line){
		clean();
		char[] input = line.toCharArray();
		
		int count = -1;
		for(char c : input){
			if('0' <= c && c <= '9'){
				if(count == -1){
					count = 0;
				}
				
				count *= 10;
				count += c - '0';
			}else{
				if(count != -1){
					push(count);
				}
				count = -1;
			}
			
			switch(c){
			case '+':
				push(ADD);
				break;
			case '-':
				push(SUB);
				break;
			case '*':
				push(MUL);
				break;
			case '/':
				push(DIV);
				break;
			case '(':
				push(KAKKO_L);
				break;
			case ')':
				push(KAKKO_R);
				break;
			}
			
			//System.out.println(stack);
		}
		
		if(count != -1){
			push(count);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		
		while(true){
			String input = sc.nextLine();
			
			if("0:".equals(input)){
				break;
			}
			count++;
			
			if(count > 4){
				count = 0;
				System.gc();
			}
			//System.gc();
			
			String[] in = input.split(":");
			//String[] tokens = in[1].split(" ");
			
			//System.out.println(Arrays.toString(tokens));
			
			//stack.clear();
			/*
			for(int i = 0; i < tokens.length; i++){
				if(tokens[i].equals("") || tokens[i].equals(" ")){
					continue;
				}
				
				add_stack(tokens[i], stack);
			}	
			*/
			
			add_stack(in[1]);
			//System.out.println(stack);
			
			final int mod = Integer.parseInt(in[0]);
			
			Expr node = parse_1();
			
			try{
				int result = node.eval(mod);
				
				System.out.println(node + " = " + result + " (mod " + mod + ")");
			}catch(ArithmeticException e){
				System.out.println("NG");
			}catch(NullPointerException e){
				for(int i = 0; i < size(); i++){
					System.out.print(queue[i] + " ");
				}
				System.out.println();
				
				System.err.println(input + "\n" + "\n" /*Arrays.toString(queue)*/);
			}
		}
		
		sc.close();
	}
}