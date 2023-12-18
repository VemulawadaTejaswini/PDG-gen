import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//String t = sc.next();
		//long n = sc.nextLong();
		//long m = sc.nextLong();
		//long k = sc.nextLong();
		//long count=0;

		/*for(int i=0;i<3;i++) {
			if(s.substring(i,i+1).equals(s.substring(i+1,i+2))) {
				count++;
			}else if(i!=2){
				count=0;
			}
		}*/
		/*if(n*m<=k) {
			System.out.println(n*m);
		}else{
			System.out.println(k);
		}*/
		System.out.println(Integer.parseInt(s.substring(0,1))+Integer.parseInt(s.substring(1,2))+Integer.parseInt(s.substring(2,3)));
	}
}


