import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int al = 0;
		int bl = 0;
		int cl = 0;
		int dl = 0;
		int ar = 0;
		int br = 0;
		int cr = 0;
		int dr = 0;
		while(sc.hasNext()){
			double l = sc.nextDouble();
			if(l >= 1.1){
				al++;
			}else if(l >= 0.6 && l < 1.1){
				bl++;
			}else if(l >= 0.2 && l <0.6){
				cl++;
			}else {
				dl++;
			}
			double r = sc.nextDouble();
			if(r >= 1.1){
				ar++;
			}else if(r >= 0.6 && r < 1.1){
				br++;
			}else if(r >= 0.2 && r <0.6){
				cr++;
			}else {
				dr++;
			}
		}
			System.out.println(al+" "+ar);
			System.out.println(bl+" "+br);
			System.out.println(cl+" "+cr);
			System.out.println(dl+" "+dr);
		
		sc.close();
	}

}