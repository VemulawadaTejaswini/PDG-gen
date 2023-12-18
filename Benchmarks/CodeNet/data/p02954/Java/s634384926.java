import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int N = S.length();

        int[] num = new int[N];

        for(int i = 0; i < N-1; i++){
            if(S.charAt(i) == 'R' && S.charAt(i+1) == 'L'){
                int index = i;
                while(index >= 0 && S.charAt(index) == 'R'){
                    if(Math.abs(i - index) % 2 == 0){
                        num[i]++;
                    }else{
                        num[i+1]++;
                    }
                    index--;
                }
                index = i+1;
                while(index < N && S.charAt(index) == 'L'){
                    if(Math.abs((i+1) - index) % 2 == 0){
                        num[i+1]++;
                    }else{
                        num[i]++;
                    }
                    index++;
                }
            }
        }
        for (int i = 0; i < N; i++) {
        	if (i!=N-1) {
        		System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i]);
			}
		}
	}
}