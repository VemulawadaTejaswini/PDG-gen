import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int x=scan.nextInt();
			int hanako=0,tarou=0,i=0;
			while(true) {
				String str1=scan.next();
				String str2=scan.next();
				int a=str1.compareTo(str2);
				if(a==-1) {
					hanako +=3;
				}else if(a==1) {
					tarou +=3;
				}else {
					hanako +=1;
					tarou +=1;
				}
				if(i==x) {
					break;
				}
				i++;
			}
			System.out.println(tarou+" "+hanako);
			scan.close();
		}
}
