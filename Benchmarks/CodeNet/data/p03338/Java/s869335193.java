import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();

		int consum=0;
		for(int i=0;i<str.length();i++){
			String subSf=str.substring(0, i);
			String subSl=str.substring(i, str.length());
			// System.out.println(subSf+"  "+subSl);
			int flength=subSf.length();
			int llength=subSl.length();

			ArrayList<Character> charF = new ArrayList<Character>();
			for(int n=0;n<flength;n++){
				if(!charF.contains(subSf.charAt(n))){
					charF.add(subSf.charAt(n));
				}
			}
			ArrayList<Character> charL = new ArrayList<Character>();
			for(int j=0;j<llength;j++){
				if(!charL.contains(subSl.charAt(j))){
					charL.add(subSl.charAt(j));
				}
			}
			int con=0;
			for(char cf:charF) {
				for(char cl:charL) {
					if(cf==cl){
						con++;
					}
				}
			}
			consum=Math.max(consum, con);
		}
		System.out.println(consum);
	}
}
