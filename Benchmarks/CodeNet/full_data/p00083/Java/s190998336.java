import java.util.*;
public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int yy = sc.nextInt();
			int mm = sc.nextInt();
			int dd = sc.nextInt();
			String y = "" + yy;
			String m = "" + mm;
			String d = "" + dd;
			if(m.length() == 1) m = "0" + m;
			if(d.length() == 1) d = "0" + d;
			int sum = Integer.parseInt(y + m + d);
			if(sum < 18680908){
				System.out.println("pre-meiji");
				continue;
			}
			else if(sum < 19120730){
				System.out.print("meiji ");
				System.out.print(yy - 1868 + 1);
			}
			else if(sum < 19261225){
				System.out.print("taisho ");
				System.out.print(yy - 1912 + 1);
			}
			else if(sum < 19890108){
				System.out.print("showa ");
				System.out.print(yy - 1926 + 1);
			}
			else{
				System.out.print("heisei ");
				System.out.print(yy - 1989 + 1);
			}
			System.out.println(" " +mm + " " + dd);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}