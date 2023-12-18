import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		int[] v = new int[n];
		int[] c = new int[n];
		for(int i = 0;i < n;i++){
			v[i] = sc.nextInt();
		}
		for(int i = 0;i < n;i++){
			c[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0;i < n;i++){
			if(v[i] - c[i] > 0){
				ans += v[i] - c[i];
			}
		}
		System.out.print(ans);
		
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


