import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			int D = sc.nextInt();
			int count = 0;
			for(int i = 0; i< N; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				if(x*x + y*y <= D*D){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}