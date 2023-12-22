import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int sum=0;
			for(int i=0;i<n/4;i++){
				int h=sc.nextInt();
				sum+=h;
			}
			System.out.println(sum);
		}
	}

}