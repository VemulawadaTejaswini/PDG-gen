import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		int k = sc.nextInt()-1;
		String str = sc.next();
		
		StringBuffer sb = new StringBuffer(str);
		char cc = str.toLowerCase().charAt(k);
		sb.setCharAt(k, cc);
		System.out.print(sb.toString());
		
		
		
		
	}
	
	
	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	




static String deletestr(String base,String remove){
	boolean flag = true;
	for(int i = 0;i < remove.length();i++){
		if(i == base.length()){
			flag = false;
			break;
		}
		if(base.charAt(i) - remove.charAt(i) != 0 && base.charAt(i) - remove.charAt(i) != 32 &&remove.charAt(i) - base.charAt(i)  != 32){
			flag = false;
			break;
		}
	}

	if(flag){
		base = base.substring(remove.length());
	}

	return base;

}



}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


