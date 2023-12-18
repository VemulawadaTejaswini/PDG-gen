import java.util.Scanner;

class Main{




	public static void main(String[] args) {





		Scanner sc = new Scanner(System.in);			//文字の入力
		String a = sc.next();
		
		int anum = 0;
		for(int i = 0;i < a.length();i++){
			if(a.charAt(i) == 'A'){
				anum = i;
				break;
			}
		}
		
		int znum = 0;
		for(int i = a.length()-1;i >= 0;i--){
			if(a.charAt(i) == 'Z'){
				znum = i;
				break;
			}
		}
		
		System.out.println(znum-anum+1);


	}
}


class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


