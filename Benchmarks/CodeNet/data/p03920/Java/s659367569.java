import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int tmp = N;
		if (N==1){
			System.out.println(1);
		}
		else if(N==2){
			System.out.println(2);
		}
		else{
			for (int i=1;i<N;i++){
				if (tmp-i>(i+1)){
					tmp -=i;
					System.out.println(i);
				}
				else{
					break;
				}
			}
			System.out.println(tmp);
		}

	}

}
