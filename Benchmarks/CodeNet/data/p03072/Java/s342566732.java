import java.util.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int max = 0;
		int ret = 0;
		for(int i = 0; i < N;i++){
			int h = scan.nextInt();
			
			if(max <= h){
				ret++;
				max =h;
			}
		}

		System.out.println(ret);
	}
}
