import java.util.Scanner;
public class Main {
	static int acount = 0;
	static int bcount = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		int n = Integer.parseInt(sc2.nextLine());
		
		for(int i=0;i<n;i++){
			String[] s = sc2.nextLine().split("[\\s]+");
			if(s[0].equals(s[1])){
				acount++;
				bcount++;
			}
			else if(s[0].compareTo(s[1]) < 0) bcount += 3;
		}
		System.out.println(acount+" "+bcount);
		
	}
}