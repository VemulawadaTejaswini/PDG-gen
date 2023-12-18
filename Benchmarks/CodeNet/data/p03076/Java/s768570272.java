import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] n = new int[5];


		int ret = 0;
		int minmod = 10;
		for(int i = 0; i < 5; i++){
			int o = scan.nextInt();
			if(o % 10 == 0) {
				ret+= o;
			}else{
				ret+= (o / 10) * 10+ 10;
				if(o % 10 < minmod){
					minmod = o % 10;
				}
			}
			//			System.err.println(ret);
		}
		if(minmod == 10){
			System.out.println(ret - 10);
		}else{
			System.out.println(ret - 10 + minmod);
		}
	}
}
