import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		int ans = 300000;
		int count = 0;
		for(int i = 1 ; i < N-1 ; i++){
			for(int il = 0 ; il < i ; il++){
				if(S.substring(il, il+1).equals("W")){
					count++;
				}
			}
			for(int ir = i+1 ; ir < N ; ir++){
				if(S.substring(ir,ir+1).equals("E")){
					count++;
				}
			}
			//System.out.println(count);
			if(ans > count){
				ans = count;
			}
			count = 0;
		}
		int count2 = 0;
		int count3 = 0;
		for(int i = 1 ; i < N ; i++){
			if(S.substring(i, i+1).equals("E")){
				count2++;
			}
		}
		for(int i = 0 ; i < N-1 ; i++){
			if(S.substring(i, i+1).equals("W")){
				count3++;
			}
		}

		System.out.println(Math.min(Math.min(count2, count3),ans));

	}

}