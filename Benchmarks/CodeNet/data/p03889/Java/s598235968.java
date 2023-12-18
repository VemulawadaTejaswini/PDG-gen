import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner don = new Scanner(System.in);
		String[] an,bn;
		String as,bs;
		as = don.next();
		an = new String[as.length()];
		bn = new String[as.length()];
		for(int i=0;i<as.length();i++){
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
		bs=bn[(as.length()-1)];
		for(int i=(as.length()-2);i>=0;i--){
			bs+=bn[i];
		}
		if(as.equals(bs)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}