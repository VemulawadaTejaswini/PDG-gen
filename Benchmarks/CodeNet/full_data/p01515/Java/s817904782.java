import java.util.Scanner;

public class Main {
	public static String input;
	public static int p;
	public static int len;
	public static boolean[] alpha = new boolean[11];
	public static void main(String[] args){
		new Main().run();
		//test();
	}
	
//	public static void test(){
//		int a = 0;
//		System.out.println(Character.getNumericValue('a'));
//		System.out.println(Character.getNumericValue('b'));
//	}
	

	public void run(){
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		while(input.equals("#") == false){
			len = input.length();
			p = 0;
			boolean left;
			boolean right;
			boolean bOK = true;
			//int c = 0;
			int bit = 0;
			
			//2^(11) - 1までやる
			for(int i = 0; i < 0x800; i++){
				//c++;
				for(int j = 0; j < 11; j++){
					alpha[j] = bit2Bool(bit, j);
				}
				p = 0;
				left = getNext();
				//"="&#65533;&#65533;&#65533;i&#65533;&#1986;&#65533;
				p++;
				//System.out.println("right");
				right = getNext();
				
				if(left != right){
					//System.out.println("a = " + alpha[alpha2Int('a')] + ", b = " + alpha[alpha2Int('b')] + ", left = " + left + ", right = "  + right);;
					//System.out.println("bad");
					bOK = false;
				}
				bit++;
			}
			
			if(bOK){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			input = sc.next();
		}
	}
	
	//bit目のビットが立っていればtrue
	public static boolean bit2Bool(int num, int bit){
		int tmp = num >> bit;
		if(tmp == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
//	public static boolean int2Bool(int n){
//		if(n == 0){
//			return false;
//		}
//		else{
//			return true;
//		}
//	}
	
//	public static int alpha2Int(char ch){
//		int num = Character.getNumericValue(ch) - Character.getNumericValue('a');
//		return num;
//	}
	

	//1&#65533;&#130;&#65533;formula&#65533;&#65533;&#65533;&#65533;&#65533;&#65533;
	public static boolean getNext(){
		boolean bRet = false;
		char c = input.charAt(p);
		//System.out.println("getNext : p = " + p + ", c = " + c);
		switch(c){
		case 'T':
			p++;
			bRet = true;
			break;
		case 'F':
			bRet = false;
			p++;
			break;
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
			bRet = alpha2Bool(c);
			p++;
			break;
		case '(':
			p++;
			boolean left = getNext();
			boolean right;
			c = input.charAt(p);
			if(c == '*'){
				p++;
				right = getNext();
				bRet = left & right;
			}
			else if(c == '+'){
				p++;
				right = getNext();
				bRet = left | right;
			}
			//case c = ->
			else{
				p += 2;
				right = getNext();
				bRet = Imp(left , right);
			}
			//")"&#65533;&#65533;&#65533;&#65533;&#65533;&#258;&#65533;&#65533;&#65533;&#834;&#65533;&#65533;I
			p++;
			break;

		case '-':
			p++;
			bRet = getNext();
			bRet = !bRet;
			break;
		}

		return bRet;
	}

	public static boolean alpha2Bool(char ch){
		int num = Character.getNumericValue(ch) - Character.getNumericValue('a');
		return alpha[num];
	}

	public static boolean Imp(boolean b1, boolean b2){
		if(b1 == true && b2 == false){
			return false;
		}
		else{
			return true;
		}
	}
}