import java.util.Scanner;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			for(int i=0;i<=50;i++) {
				//中間テストm,期末テストf,再テストrの点数をげっと
				int m=sc.nextInt();
				int f=sc.nextInt();
				int r=sc.nextInt();
				//ここから条件分岐
				if(m==-1 && f==-1 && r==-1) break;
				if(m==-1 || f==-1) System.out.println('F');
				else if((m+f)>=80) System.out.println('A');
				else if((m+f)>=65 && (m+f)<80) System.out.println('B');
				else if((m+f)>=50 && (m+f)<65) System.out.println('C');
				else if((m+f)>=30 && (m+f)<50) {
					
					if(r>=50 ) System.out.println('C');
					else System.out.println('D');
				}
				else if((m+f)<30 || m==-1 || f==-1) System.out.println('F');
			}
		}
	}
}



