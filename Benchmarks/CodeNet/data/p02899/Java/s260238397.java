import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int student[] = new int[N];
	
		for(int i= 1;i<N+1; ++i) {
			student[sc.nextInt()-1] = i ;
		}
		
		for(int j=0;j<N;++j) {
			System.out.print(student[j]+" ");
		}
	}	
}