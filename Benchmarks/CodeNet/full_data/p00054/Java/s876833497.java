import java.util.Scanner;


public class Test {
	public static void main(String[] args){
		Scanner scan = null;
		try{
			double a , b;
			int n;
			scan = new Scanner(System.in);
			while(scan.hasNextInt()){
				a = scan.nextInt();
				b = scan.nextInt();
				n = scan.nextInt();
				double m =(a / b);
				m -= (int)m;
				int sum = 0;
				for(int i = 0 ; i < n;i++){
					m*=10;
					sum += (int)m;
					m -=(int)m;
				}
				System.out.println(sum);
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}