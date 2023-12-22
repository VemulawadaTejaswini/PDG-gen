import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			long D = sc.nextLong();
			int count = 0;
			for(int i = 0; i< N; i++){
				long x = sc.nextLong();
				long y = sc.nextLong();
				if(x*x + y*y <= D*D){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}