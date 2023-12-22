import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long sum = 0;
		long tmp = 0;
		
		while(stdIn.hasNext()){
			String a = stdIn.nextLine();
			char[] b = new char[100];
			b = a.toCharArray();
			tmp = 0;
			for(int i=0;i<b.length;i++){
				if(b[i]>='0'&&b[i]<='9'){
					tmp*=10;
					tmp+=b[i]-'0';
				}
				else{
					sum+=tmp;
					tmp=0;
				}
			}
		}
		sum+=tmp;
		System.out.println(sum);
	}
}