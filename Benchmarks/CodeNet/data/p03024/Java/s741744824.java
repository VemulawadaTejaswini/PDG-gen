import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	int K = sc.nextInt();
	String S[] = new String [K];
	int count = 0;
	
	if(K>=1 && K<=15){
		for(int i=0; i<K; i++){
			S[i] = sc.next();
		}
		for(int x=0; x<K; x++){
			if(S[x].equals("x")){
				count++;
			}
		}
		if(count<8){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	}

}