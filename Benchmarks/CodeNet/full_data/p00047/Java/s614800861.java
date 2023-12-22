import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		boolean[] abc = {true,false,false};
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] st = sc.nextLine().split(",");
			int a = alphabetChangeToInt(st[0]);
			int b = alphabetChangeToInt(st[1]);
			boolean tmp = abc[a];
			abc[a] = abc[b];
			abc[b] = tmp;
		}
		for(int i = 0 ; i < 3 ; i++){
			if(abc[i]){
				System.out.println(intToAlphabet(i));
				break;
			}
		}
		sc.close();
	}
	
	public static int alphabetChangeToInt(String st){
		if(st.equals("A")){
			return 0;
		}else if(st.equals("B")){
			return 1;
		}else if(st.equals("C")){
			return 2;
		}
		return -1;
	}
	
	public static String intToAlphabet(int n){
		if(n == 0){
			return "A";
		}else if(n == 1){
			return "B";
		}else if(n == 2){
			return "C";
		}
		return null;
	}
}