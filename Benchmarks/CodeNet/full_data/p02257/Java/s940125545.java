import java.util.*;

class Main{
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
			}else if(num > 22222222){
				j = 22222221;
			}else if(num > 33333333){
				j = 33333332;
			}else if(num > 44444444){
				j = 44444443;
			}else if(num > 55555555){
				j = 55555554;
			}else if(num > 66666666){
				j = 66666665;
			}else if(num > 77777777){
				j = 77777776;
			}else if(num > 88888888){
				j = 88888887;
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