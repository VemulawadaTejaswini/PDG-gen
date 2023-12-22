import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan =  null;
		try{
			scan = new Scanner(System.in);
			int n;
			while((n = scan.nextInt())!= 0){
				int A = 0,B = 0;
				for(int i = 0; i < n;i++){
					int a = scan.nextInt(),b = scan.nextInt();
					if(a < b)B += b+a;
					else if(a > b)A += b+a;
					else{
						A +=a;
						B +=b;
					}
				}
				System.out.printf("%d %d\n",A,B);
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}