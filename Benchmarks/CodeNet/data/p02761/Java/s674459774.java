import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
		int M = sc.nextInt();
		int[] s = new int[M];
		int[] c = new int[M];
		for(int i=0;i<M;i++){
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		int number[] = new int[N];
		// 初期値設定
		for(int i=0;i<N;i++){
			number[i] = -1;
		}		
		for(int i=0;i<M;i++){
			if(number[s[i]-1] == -1
			|| number[s[i]-1] == c[i]){
				number[s[i]-1] = c[i];
			}else{
				System.out.println("-1");
				return;
			}
		}
		String result = "";
		for(int i=0;i<N;i++){
			if(number[i] == -1){
				result += "0";
			}else{
				result += number[i];
			}
		}
		if(Integer.parseInt(result) == 0 && !"0".equals(result)){
			System.out.println("-1");
		}else{
			System.out.println(Integer.parseInt(result));
		}
	}
}