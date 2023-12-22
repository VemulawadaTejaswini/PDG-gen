import java.util.*;

class PrimeNum {
	public static void main(String args[]){
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int cnt = 0;
		ar.add(6);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		ar.add(7);
		for(int i = 0;i < 7;i++){
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