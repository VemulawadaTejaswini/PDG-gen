import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
      	int sum = 0;
		for(int i=0;i<N;i++){
		sum += sc.nextInt();
		}
  		if(H - sum <= 0){
		System.out.println("Yes");
		}else{
		System.out.println("No");
        }
	}
}