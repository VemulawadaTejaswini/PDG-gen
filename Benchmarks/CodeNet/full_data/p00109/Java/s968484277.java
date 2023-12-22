import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		RPN rpn;
		Calculator c;
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<n;i++){
			rpn = new RPN(sc.nextLine());
			c = new Calculator(rpn.toRPN());
			System.out.println(c.getResult());
		}
	}
}

class Calculator{
	private String[] formula;
	private Stack<Long> stack;
	
	public Calculator(String formula){
		this.formula = formula.split(" ");
		stack = new Stack<Long>();
	}
	
	private void calculate(){
		long n,a,b;
		for(int i=0;i<formula.length;i++){
			if(formula[i].equals("")){
				continue;
			}
			try{
				n = Long.parseLong(formula[i]);
				stack.push(n);
			}catch(NumberFormatException e){
				b = stack.pop();
				a = stack.pop();
				if(formula[i].equals("+")){
					stack.push(a+b);
				}else if(formula[i].equals("-")){
					stack.push(a-b);
				}else if(formula[i].equals("*")){
					stack.push(a*b);
				}else if(formula[i].equals("/")){
					stack.push(a/b);
				}
			}
		}
	}
	
	public long getResult(){
		calculate();
		return stack.pop();
	}
}

class RPN{
	private Stack<Character> stack;
	private String rpn,formula,tmp;
	private int[] opeNum,top;
	private int current;
	private ArrayList<Integer> leftParenthesis;
	private boolean[] minusFlag;
	
	public RPN(String formula){
		this.formula = formula;
		rpn = "";
		opeNum = new int[100];
		current = 0;
		top = new int[100];
		minusFlag = new boolean[100];
		leftParenthesis = new ArrayList<Integer>();
		stack = new Stack<Character>();
	}
	
	public String toRPN(){
		char tmp;
		for(int i=0;i<formula.length();i++){
			tmp = formula.charAt(i);
			if(Character.isDigit(tmp)){
				minusFlag[current] = true;
				rpn += tmp;
			}else{
				if(tmp == ')'){
					for(int j=0;j<opeNum[current]-1;j++){
						rpn += " ";
						rpn += stack.pop();
					}
					stack.pop();
					opeNum[current] = 0;
					top[current] = 0;
					current --;
				}else if(tmp == '('){
					stack.push(tmp);
					current ++;
					opeNum[current]++;
				}else if(tmp == '/'){
					rpn += " ";
					setOperator(3,tmp);
				}else if(tmp == '*'){
					rpn += " ";
					setOperator(2,tmp);
				}else if(tmp == '-'){
					if(!minusFlag[current]){
						rpn += tmp;
					}else{
						rpn += " ";
						setOperator(1,tmp);
					}
				}else if(tmp == '+'){
					rpn += " ";
					setOperator(1,tmp);
				}
				minusFlag[current] = true;
			}
		}
		
		for(int i=0;i<opeNum[0];i++){
			rpn += " ";
			rpn += stack.pop();
		}
		
		return rpn;
	}
	
	private void setOperator(int n,char tmp){
		if((current == 0) && (top[current] >= n)){
			for(int i=0;i<opeNum[current];i++){
				rpn += stack.pop();
				rpn += " ";
			}
			stack.push(tmp);
			top[current] = n;
			opeNum[current] = 1;
		}else{
			if(top[current] >= n){
				for(int i=0;i<opeNum[current]-1;i++){
					rpn += stack.pop();
					rpn += " ";
				}
				stack.push(tmp);
				top[current] = top[current] - top[current]%10 + n;
				opeNum[current] = 2;
			}else{
				stack.push(tmp);
				opeNum[current]++;
				top[current] = n;
			}
		}
	}
}