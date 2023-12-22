import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int kuro = 0;
		char[][] rc = new char[r][c];
		for(int i = 0; i< r; i++){
			String tmp = sc.next();
			for(int j = 0; j < c; j++){
				rc[i][j] = tmp.charAt(j);
				if(rc[i][j] == '#')
					kuro++;
			}
		}
		k = kuro - k;
		int res = 0;
		if(k > kuro){

		}else if ( k == kuro){
			res = 1;
		}else{
			for(int rr = 0; rr < Math.pow(2, r);rr ++){
				for(int cc = 0; cc < Math.pow(2,  c); cc++){
					int delkuro = 0 ;
					for(int rrr = 0; rrr < r; rrr++ ){
						for(int ccc = 0; ccc < c; ccc++){
							if((1&rr>>rrr) == 1){
								if((1&cc>>ccc)==1){
									for(int i = 0; i < r; i++){
										if(rc[rrr][i] == '#'){
											delkuro ++;
										}
										if(rc[i][ccc] == '#'){
											delkuro ++;
										}
										if(rc[rrr][ccc] == '#'){
											delkuro --;
										}
									}
								}
							}
						}
					}
					if(k==delkuro){
						res++;
					}
				}
			}
		}
		System.out.println(res);
	}
}