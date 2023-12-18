import java.util.*;
public static ArrayList<String> list;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		int buf = 0;
		Map<Integer,ArrayList<Integer>> town = new HashMap<>();
		for(int i = 0;i < N;i++){
			ArrayList<Integer> point = new ArrayList<>();
			point.add(sc.nextInt());
			point.add(sc.nextInt());
			town.put(i,point);
		}
		list = new ArrayList<>();
		permutation(N);
		for(String s : list){
			for(int i = 0;i < N-1;i++){
				List<Integer> buf = new ArrayList<>();
				List<Integer> buf2 = new ArrayList<>();
				int town1 = s.charAt(i) - '0';
				int town2 = s.charAt(i+1) - '0';
				buf = town.get(town1);
				buf2 = town.get(town2);
				sum += Math.sqrt((buf[0] - buf2[0]) * (buf[0] - buf2[0]) + (buf[1] - buf2[1]) * (buf[1] - buf2[1]));
			}
			sum2 += sum;
			buf++;
		}
		System.out.println(sum2 / buf);
	}
	public static void permutation(int N){
		String number = null;
		boolean flg = true;
		for(int i = 0;i < N;i++){
			number += String.valueOf('0' + i);
		}
		while(flg){
			list.add(number);
			for(int i = N-1;i > 0;i--){
				if(number.charAt(i) > number.charAt(i-1)){
					if(i == N-1){
						number = number.substring(i - 1) + String.valueOf(number.charAt(i)) + String.valueOf(number.charAt(i - 1));
						continue;
					}else{
						number = number.substring(i-1) + String.valueOf(number.charAt(i)) + String.valueOf(number.charAt(i - 1)) + number.substring(i + 1,N);
						continue;
					}
				}else if(i == 1){
					flg = false;
				}
			}
		}
	}
}