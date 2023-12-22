import java.util.Scanner;
public class Main {
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String sstr=sc.nextLine();
		int indexStart=0;
		int sstrlength=sstr.length();
		int count=0;
		while(true) {
			int t=str.indexOf(sstr,indexStart);
			if(t>=0) {
				count++;
				indexStart=t+sstrlength;
			}else {
				break;
			}
		}
		System.out.println(count);
		}
}

