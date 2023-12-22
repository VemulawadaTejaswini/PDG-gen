import java.util.Scanner;

public class Main {
	final static int NO_MATCHING = -1;//??¬??§??????????????????
	final static int ROUNDNESS = 0;//?????¬??§,()
	final static int ANGULAR = 1;//?§???¬??§,[]
	Scanner s;
	int caret;
	void run(){
		s = new Scanner(System.in);
		while(true){
			String str = s.nextLine();
			caret = 0;
			if(".".equals(str))return;
			if(searchBalance(str,-1)){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}

	boolean searchBalance(String str,int type){
		while(true){
			if(caret >= str.length()){
				str = s.nextLine();
				caret = 0;
			}
			char ch = str.charAt(caret);
			caret++;
			switch(ch){
			case '(':
				if(!searchBalance(str,0)){
					return false;
				}
				break;
			case '[':
				if(!searchBalance(str,1)){
					return false;
				}
				break;
			case ')':
				if(type == ROUNDNESS){
					return true;
				}else{
					return false;
				}
			case ']':
				if(type == ANGULAR){
					return true;
				}else{
					return false;
				}
			default:
				break;
			}
			if(ch == '.')break;
		}
		if(type == -1){
			return true;
		}else{
			return false;
		}
	}


	public static void main(String args[]){
		new Main().run();
	}
}