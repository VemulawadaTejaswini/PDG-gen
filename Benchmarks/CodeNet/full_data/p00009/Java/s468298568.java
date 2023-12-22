import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		boolean[] n = new boolean[1000000] ;
		for(int i = 0;i< 1000000;i++){
			if(i <=1){
				n[i] = false;} else
					if(i > 1){
						n[i] = true;
					}
			}
	for(int i = 2;i < 1000000;i++){
		if(n[i] == true){
			for(int j = 2;j*i < 1000000;j++){
				n[j*i] = false;
			}
		}
	}
		Scanner scan = new Scanner(System.in);
		int N;
	while(scan.hasNext()){
		N = scan.nextInt();
		 int count = 0;

		for(int i = 0;i <= N;i++){
			if(n[i] == true){count = count +1;
		}
		}
			System.out.println(count);

		}

	}
}