import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		String str = sc.nextLine();
		int jcnt = 0;
		int icnt = 0;
		for(int i = 0 ; i < str.length() -2 ; i++){
			if("JOI".equals(str.substring(i,i+3))){
				jcnt++;
			}else if("IOI".equals(str.substring(i,i+3))){
				icnt++;
			}
		}
		System.out.println(jcnt);
		System.out.println(icnt);
		}
	}

}