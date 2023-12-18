import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力]
		int N = sc.nextInt();
		int[] number = new int[N];
		boolean[] notpair = new boolean[N];
		int count = 0;
      
		for(int i=0; i<N; i++){
			number[i] = sc.nextInt();
        }
		for(int i=0; i<N; i++){
			if((notpair[i]==true)&&(notpair[number[i]-1]==true)&&(i==number[number[i]-1]-1)){
				notpair[i] = false;
				notpair[number[i]-1] = false;
				count++;
				//System.out.println(i);
			}
        }
      	
		System.out.println(count);
	}
}