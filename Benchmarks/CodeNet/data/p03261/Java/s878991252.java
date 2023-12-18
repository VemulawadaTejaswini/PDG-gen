import java.util.ArrayList;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		ArrayList<String> cc = new ArrayList<String>();
		String[] word = new String[N];
		for(int i = 0;i < N;i++){
			word[i] = sc.next();
		}
		cc.add(word[0]);
		for(int i = 1;i < N;i++){
			if(word[i-1].charAt(word[i-1].length()-1) != word[i].charAt(0)){
				System.out.println("No");
				return;
			}else{
				for(int j = 0;j < cc.size();j++){
					if(cc.get(j).equals(word[i])){
						System.out.println("No");
						return;
					}
				}
				cc.add(word[i]);
			}
		}
		System.out.println("Yes");

	}


}




class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

