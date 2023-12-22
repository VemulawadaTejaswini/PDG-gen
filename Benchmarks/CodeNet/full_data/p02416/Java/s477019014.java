import java.util.Scanner;
public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String work = "";
		int len,sum;
		work = sc.next();
		len = work.length();
		sum = 0;
		while(true){
			if(work.charAt(0) == '0'){
				break;
			}
			for(int i = 0; i < len; i++){
				sum += Integer.parseInt(work.substring(i,i+1));
			}
			System.out.println(sum);
			work = sc.next();
			len = work.length();
			sum = 0;
		}
	}
}