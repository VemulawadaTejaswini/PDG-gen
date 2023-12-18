import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String[] C = S.split("",0);
		int max=0;
		int counta=0;
		for(int i=0;i<S.length();i++){
			if(C[i].equals("A")||C[i].equals("C")||C[i].equals("G")||C[i].equals("T")){
				counta++;
				if(max<=counta){
					max=counta;
				}
			}
			else{
				counta=0;
			}
		}
		System.out.println(max);
	}
}