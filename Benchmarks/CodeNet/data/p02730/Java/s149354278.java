import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] S = str.split("");
		//System.out.println(S[0]);
		for(int i=0; i<S.length; i++){
			if(!(S[i].equals(S[S.length-1-i]))){
				System.out.println("No");
				return;
			}
			if(i<(S.length-1)/2-1-i){
				if(!(S[i].equals(S[(S.length-1)/2-1-i]))){
					System.out.println("No");
					return;
				}
			}
			if(i>=(S.length+3)/2-1&&i<((S.length+3)/2+S.length)/2){
				if(!(S[i].equals(S[S.length-1-i]))){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
