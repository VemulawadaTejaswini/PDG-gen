import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int[] stack=new int[100];
		int stackPointer=0;
		String s;
		while(scan.hasNext()){
			s=scan.next();
			if(s.equals("+")){
				stack[stackPointer-2]=stack[stackPointer-2]+stack[stackPointer-1];
				stackPointer-=2;
			}else if(s.equals("-")){
				stack[stackPointer-2]=stack[stackPointer-2]-stack[stackPointer-1];
				stackPointer-=2;
			}
			else if(s.equals("*")){
				stack[stackPointer-2]=stack[stackPointer-2]*stack[stackPointer-1];
				stackPointer-=2;
			}
			else{
				stack[stackPointer++]=Integer.parseInt(s);
			}
		}
		System.out.println(stack[0]);
		scan.close();
	}
}