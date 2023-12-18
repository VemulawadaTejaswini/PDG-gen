import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner don = new Scanner(System.in);
		String[] an,bn;
		String as;
		an = new String[4];
		bn = new String[4];
		as = don.next();
		for(int i=0;i<4;i++){
			if(String.valueOf(as.charAt(i)).equals("d")){
				an[i]="d";
				bn[i]="b";
			}else if(String.valueOf(as.charAt(i)).equals("b")){
				an[i]="b";
				bn[i]="d";
			}else if(String.valueOf(as.charAt(i)).equals("p")){
				an[i]="p";
				bn[i]="q";
			}else{
				an[i]="q";
				bn[i]="p";
			}
		}
		if(as.equals(bn[3]+bn[2]+bn[1]+bn[0])){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}