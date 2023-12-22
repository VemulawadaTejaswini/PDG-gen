import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int i,n = sc.nextInt();
		int max = 1,min = 200001,buf;
		int dif = Integer.MIN_VALUE;
		
		for(i=0;i<n;i++){
			buf = sc.nextInt();
			if(buf > max) max = buf;
			else if(buf < min){
				min = buf;
				dif = Math.max(dif, (max-min));
			}
		}
		System.out.println(dif);
	}
}
