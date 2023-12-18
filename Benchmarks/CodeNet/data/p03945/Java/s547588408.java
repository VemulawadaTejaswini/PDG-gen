import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.nextInt();
		// スペース区切りの整数の入力
		String sa[] = new String[S.length];
		int counter = 0;
		for(int i=0; i<S.length; i++){
			sa[i] = S.charAt(i);
			if(i > 1){
				if(sa[i].equals(sa[i-1])){
					
				}
				else{
					counter = counter + 1;
				}
			}
		}
		System.out.println(counter);
}
}