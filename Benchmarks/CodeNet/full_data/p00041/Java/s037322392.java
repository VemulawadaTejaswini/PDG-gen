import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static int[] input = new int[4];
	public static String ss = null;
	public static int ptr = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();
		//test();

	}
	
	public static void test(){
		String s = String.format("%d%d%c%d%d%c%c", 7,5,'*',5,5,'*','-');
		System.out.println(s);
		int ret = analyze(s);;
		System.out.println("s = " + s + ", ret = " + ret);
	}

	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++){
			input[i] = sc.nextInt();
		}
		while(input[0] != 0){
			String ans = searchAll();
			if(ans == null){
				System.out.println(0);
			}
			else{
				ans = decode(ans);
				System.out.println(ans);
			}
			for(int i = 0; i < 4; i++){
				input[i] = sc.nextInt();
			}
		}
	}

	public static String searchAll(){
		//後置ポーランド記法で全パターン試す
		//"nn#n#n#", "nn#nn##", "nnn##n#", "nnn#n##", "nnnn###"(n:値 #:演算子)
		String ans = null;
		int[] num = new int[4];
		char[] operator = {'+', '-', '*'};
		char[] op = new char[3];
		for(int i = 0; i < 4; i++){
			num[0] = input[i];
			input[i] = 0;
			for(int j = 0; j < 4; j++){
				if(input[j] == 0){
					continue;
				}
				num[1] = input[j];
				input[j] = 0;
				for(int k = 0; k < 4; k++){
					if(input[k] == 0){
						continue;
					}
					num[2] = input[k];
					input[k] = 0;
					for(int l = 0; l < 4; l++){
						if(input[l] == 0){
							continue;
						}
						num[3] = input[l];
						input[l] = 0;
						for(int m = 0; m < 3; m++){
							op[0] = operator[m];
							for(int n = 0; n < 3; n++){
								op[1] = operator[n];
								for(int o = 0; o < 3; o++){
									op[2] = operator[o];
									//"nn#n#n#"
									String s = String.format("%d%d%c%d%c%d%c", num[0],num[1],op[0],num[2],op[1],num[3],op[2]);
									int ret = analyze(s);
									if(ret == 10){
										return s;
									}
									//"nn#nn##"
									s = String.format("%d%d%c%d%d%c%c", num[0],num[1],op[0],num[2],num[3],op[1],op[2]);
									ret = analyze(s);
									if(ret == 10){
										return s;
									}
									//"nnn##n#"
									s = String.format("%d%d%d%c%c%d%c", num[0],num[1],num[2],op[0],op[1],num[3],op[2]);
									ret = analyze(s);
									if(ret == 10){
										return s;
									}
									//"nnn#n##"
									s = String.format("%d%d%d%c%d%c%c", num[0],num[1],num[2],op[0],num[3],op[1],op[2]);
									ret = analyze(s);
									if(ret == 10){
										return s;
									}
									//"nnnn###"
									s = String.format("%d%d%d%d%c%c%c", num[0],num[1],num[2],num[3],op[0],op[1],op[2]);
									ret = analyze(s);
									if(ret == 10){
										return s;
									}
								}
							}
						}
						input[l] = num[3];
					}
					input[k] = num[2];
				}
				input[j] = num[1];
			}
			input[i] = num[0];
		}
		return ans;
	}
	
	public static String decode(String s){
		ss = s;
		//多分6のはず
		ptr = s.length() - 1;
		return _getNext();
	}
	//sを後ろからptrで解析
	public static String _getNext(){
		String ret = null, left = null, right = null;
		char c = ss.charAt(ptr--);
		if(c == '+'){
			right = _getNext();
			left = _getNext();
			ret = "(" + left + " + " + right + ")";
		}
		else if(c == '-'){
			right = _getNext();
			left = _getNext();
			ret = "(" + left + " - " + right + ")";
		}
		else if(c == '*'){
			right = _getNext();
			left = _getNext();
			ret = "(" + left + " * " + right + ")";
		}
		else{
			//数字のはず
			ret = String.valueOf(c);
		}
		return ret;
	}
	
	public static int analyze(String s){
		ss = s;
		//多分6のはず
		ptr = s.length() - 1;
		return getNext();
	}
	//sを後ろからptrで解析
	public static int getNext(){
		int ret = 0, left = 0, right = 0;
		char c = ss.charAt(ptr--);
		if(c == '+'){
			right = getNext();
			left = getNext();
			ret = left + right;
		}
		else if(c == '-'){
			right = getNext();
			left = getNext();
			ret = left - right;
		}
		else if(c == '*'){
			right = getNext();
			left = getNext();
			ret = left * right;
		}
		else{
			//数字のはず
			ret = Character.getNumericValue(c);
		}
		return ret;
	}
}