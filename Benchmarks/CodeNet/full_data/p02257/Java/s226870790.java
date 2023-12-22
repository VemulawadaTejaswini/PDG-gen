import java.util.*;

class Main {
	public static void main(String args[]){
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			ar.add(sc.nextInt());
		}
		int size = ar.size();
		for(int i = 0;i < size;i++){
			int num = ar.get(i);
			if(num == 2){
				cnt++;
			}
			double d = Math.floor(num / 2);
			int j = 1;
			if(num > 99999){
				j = 99999;
			}else if(num > 999999){
				j = 999999;
			}else if(num > 9999999){
				j = 9999999;
			}else if(num > 99999999){
				j = 99999999;
			}else if(num > 555555555){
				j = 555555554;
			}
			for(j += 1;j < num;j++){
				if(num % j == 0){
					break;
				}else if(num - j == d){
					cnt++;
					break;
				}else if (j == num - 1){
					cnt++;
				}
				
			}
			
		}
		System.out.println(cnt);
	}
}