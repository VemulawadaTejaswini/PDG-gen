import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int s = sc.nextInt();
		int[] f =new int[1000001];
		
		int[] cc = new int[1000000];
		for(int i = 1;i < 1000001;i++){
			if(i == 1){
				f[i] = s;
			}else if(f[i-1] % 2 == 0){
				f[i] = f[i-1] /2;
			}else{
				f[i] = 3*f[i-1] + 1;
			}
//			System.out.println(f[i]);

			if(cc[f[i]] > 0){
				System.out.println(i);
				return;
			}
			cc[f[i]]++;
			
		}
		
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

