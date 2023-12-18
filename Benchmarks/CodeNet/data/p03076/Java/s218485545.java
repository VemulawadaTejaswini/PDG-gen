import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int[] data = new int[5];
		for(int i = 0;i < 5;i++){
			data[i] = sc.nextInt();
		}
		
		int index = 0;
		int min = 10;
		for(int i = 0;i < 5;i++){
			int sub = data[i] % 10;
			
			if(sub < min && sub != 0){
				index = i;
				min = sub;
			}
			
		}
		
		int ans = 0;
		for(int i = 0;i < 5;i++){
			if(i != index){
				while(data[i] % 10 != 0){
					data[i] = data[i] + 1;
				}
			}
			ans += data[i];
		}
		System.out.print(ans );
		

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


