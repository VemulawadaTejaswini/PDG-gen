import java.util.Scanner;
public class Main{
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int X= (int) (N/1.08);
	for(int i=X;;i++) {
		if(i*1.08>=N&&i*1.08<N+1) {
			System.out.println(i);
			System.exit(0);
		}else if(i*1.08>=N+1){
			System.out.println("(:");
			System.exit(0);
		}
	}

}
}