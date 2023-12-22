import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int N = sc.nextInt();
			if(N==0)break;
			int t=0;
			for(int i=0;i<(N/4);i++){
				t += sc.nextInt(); 
			}
			System.out.println(t);
		}
	}

}