import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++){
			int l=0;
			int r=0;
			boolean flag=true;
			for(int j=0; j<10; j++){
				int num = sc.nextInt();
				if(l<num){
					l=num;
				}else if(r<num){
					r=num;
				}else{
					flag=false;
					break;
				}
			}
			if(flag)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}