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
	
	public static void test(){
		boolean b;
		System.out.println(Character.getNumericValue('a'));
		System.out.println(Character.getNumericValue('b'));
	}
	

	public void run(){
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		while(input.equals("#") == false){
			len = input.length();
			p = 0;
			boolean left;
			boolean right;
			boolean bOK = true;
			int c = 0;
			//a~k&#199;?&#199;&#9674;&#199;&#402;&#199;&#63743;&#233;&#233;&#199;?
			for(int i1 = 0; i1 < 2; i1++){
				alpha[alpha2Int('a')] = int2Bool(i1);
				for(int i2 = 0; i2 < 2; i2++){
					alpha[alpha2Int('b')] = int2Bool(i2);
					for(int i3 = 0; i3 < 2; i3++){
						alpha[alpha2Int('c')] = int2Bool(i3);
						for(int i4 = 0; i4 < 2; i4++){
							alpha[alpha2Int('d')] = int2Bool(i4);
							for(int i5 = 0; i5 < 2; i5++){
								alpha[alpha2Int('e')] = int2Bool(i5);
								for(int i6 = 0; i6 < 2; i6++){
									alpha[alpha2Int('f')] = int2Bool(i6);
									for(int i7 = 0; i7 < 2; i7++){
										alpha[alpha2Int('g')] = int2Bool(i7);
										for(int i8 = 0; i8 < 2; i8++){
											alpha[alpha2Int('h')] = int2Bool(i8);
											for(int i9 = 0; i9 < 2; i9++){
												alpha[alpha2Int('i')] = int2Bool(i9);
												for(int i10 = 0; i10 < 2; i10++){
													alpha[alpha2Int('j')] = int2Bool(i10);
													for(int i11 = 0; i11 < 2; i11++){
														alpha[alpha2Int('k')] = int2Bool(i11);
														//System.out.println("count = " + c);
														c++;
														p = 0;
														left = getNext();
														//"="&#239;&#8482;&#234;i&#199;&#64258;&#199;&#200;
														p++;
														//System.out.println("right");
														right = getNext();
														
														if(left != right){
															//System.out.println("a = " + alpha[alpha2Int('a')] + ", b = " + alpha[alpha2Int('b')] + ", left = " + left + ", right = "  + right);;
															//System.out.println("bad");
															bOK = false;
														}
														
													}
												}
											}
										}
									}
								}
							}					
						}					
					}
				}
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
	
	public static boolean int2Bool(int n){
		if(n == 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	public static int alpha2Int(char ch){
		int num = Character.getNumericValue(ch) - Character.getNumericValue('a');
		return num;
	}
	

	//1&#199;&#172;&#199;&#195;formula&#199;&#63743;&#232;&#224;&#243;&#249;
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
			//")"&#199;&#8482;&#199;卒&#199;&#402;&#199;&#162;&#199;&#200;&#199;&#213;&#199;&#8719;&#197;I
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