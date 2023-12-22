import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new java.util.Scanner(System.in);
		int count,Judg,taroP=0,hanakoP=0;
		String taroC,hanakoC;
		count= sc.nextInt();

		for(int i =0; i<count; i++) {
			taroC = sc.next();
			hanakoC = sc.next();
			Judg = taroC.compareTo(hanakoC);
			if(Judg==0) {
				taroP++;
				hanakoP++;
			}else if(Judg<0) {
				hanakoP +=3;
			}else if(Judg>0) {
				taroP +=3;
			}
		}
		System.out.println(taroP+" "+hanakoP);
	}
}

