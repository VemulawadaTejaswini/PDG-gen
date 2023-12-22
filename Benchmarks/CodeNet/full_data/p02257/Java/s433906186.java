import java.util.*;

class PrimeNum {
	public static void main(String args[]){
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			ar.add(sc.nextInt());
		}
		int size = ar.size() - 1;
		for(int i = 0;i < size;i++){
			int num = ar.get(i);
			if(num == 2){
				cnt++;
			}
			for(int j = 2;j < num;j++){
				if(num % j == 0){
					break;
				}else if(num - j == 1){
					cnt++;
				}
			}
		}
		System.out.println("PrimeNumber = "+cnt);
	}
}