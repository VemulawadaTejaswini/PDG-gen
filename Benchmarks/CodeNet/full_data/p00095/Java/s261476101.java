import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int max=-1;
		int num=0;
		int maxnum=0;
		int v;
		for(int i=0;i<n;i++){
			num=scan.nextInt();
			v=scan.nextInt();
			if(v<max){
				max=v;
				maxnum=num;
			}
		}
		System.out.println(maxnum+" "+max);
	}
}