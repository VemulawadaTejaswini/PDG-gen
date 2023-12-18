import java.util.Scanner;


public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=Integer.parseInt(sc.next());
		int h[]=new int[100];
		int sum=1;

		for(int i=0;i<n;i++){
			h[i]=Integer.parseInt(sc.next());
			if(i!=0&&h[i-1]<=h[i]){
				sum+=1;
			}
		}
		System.out.println(sum);
	}

}