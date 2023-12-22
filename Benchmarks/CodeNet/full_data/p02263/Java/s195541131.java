import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//?????????
		String[] arrayString = bf.readLine().split(" ");
		
		//Stack
		Stack stack=new Stack();
		
		for(int i=0;i<arrayString.length;i++){
			String str=arrayString[i];
			if(str.equals("+")){
				stack.push(stack.pop()+stack.pop());
			}else if(str.equals("-")){
				int a=stack.pop();
				int b=stack.pop();
				stack.push(b-a);
			}else if(str.equals("*")){
				stack.push(stack.pop()*stack.pop());
			}else{
				stack.push(Integer.parseInt(str));
			}
		}
		
		System.out.println(stack.pop());
	}

}
class Stack{
	ArrayList<Integer> array;
	
	public Stack(){
		array=new ArrayList<Integer>();
	}
	
	public void push(int i){
		array.add(i);
	}
	
	public int pop(){
		int result=array.get(array.size()-1);
		array.remove(array.size()-1);
		return result;
	}
}