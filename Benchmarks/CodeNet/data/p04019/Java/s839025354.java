import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = 0,S = 0,E = 0,W = 0;
		String s = scanner.nextLine();
		for(int i = 0; i < s.length(); i++){
			if (s.charAt(i) =='N') {
				N++;
			}else if (s.charAt(i) =='E'){
				E++;
			}else if (s.charAt(i) =='W'){
				W++;
			}else if (s.charAt(i) =='S'){
				S++;
			}
		}
		if(((N >= 1 && S >= 1) || (N == 0 && S == 0)) && ((W >= 1 && E >= 1) || (W == 0 && E == 0))){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}