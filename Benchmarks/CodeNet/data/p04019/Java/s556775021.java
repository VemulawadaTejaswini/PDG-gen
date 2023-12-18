import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		String[] A1 = A.split("");
		int N = 0;
		int W = 0;
		int S = 0;
		int E = 0;
		int ud = 0;
		int rl = 0;

		for(int i=0; i<A.length(); i++){
			if(A1[i].equals("N")){
				N++;
			}else if(A1[i].equals("W")){
				W++;
			}else if(A1[i].equals("S")){
				S++;
			}else if(A1[i].equals("E")){
				E++;
			}
		}

		if(N==S || (N>0&&S>0)){
			ud++;
		}
		if(W==E || (W>0&&E>0)){
			rl++;
		}

		if(ud == 1 && rl ==1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}