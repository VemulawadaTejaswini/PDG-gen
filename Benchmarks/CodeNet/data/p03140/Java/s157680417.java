import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();

		int count =0;
		for(int i = 0;i < n;i++){
			if(A.charAt(i) == B.charAt(i) && A.charAt(i) == C.charAt(i)){
				
			}else if(A.charAt(i) == B.charAt(i) || A.charAt(i) == C.charAt(i) ||B.charAt(i) == C.charAt(i)){
				count++;
			}else{
				count += 2;
			}
		}
		System.out.println(count);

		
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

