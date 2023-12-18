import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		String S = scan.nextLine();
		String[] s = S.split("",0);
		int r = 0;
		int b = 0;
		for(int i=0;i<N;i++){
			if(s[i].equals("R")){
				r++;
			}
			else{
				b++;
			}
		}
		if(r>b){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}