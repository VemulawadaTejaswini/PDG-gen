import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int num[] =new int[times];
		int keisan = 0;
		int sosu = 0;
		boolean tf = true;
		for(int i=0;i<times;i++){
			num[i] = scan.nextInt();
		}

		for(int i=0;i<times;i++){
			tf = true;
			if(num[i] == 2 || num[i] % 2 == 0){
				tf = false;
			}
			int ii=3;
			while (ii <= Math.sqrt(num[i])){
				if(num[i] % ii == 0){
					tf = false;
				}
				ii += 2;
			}
			if (num[i] == 2){
				tf = true;
			}
			if(tf == true){
				sosu +=1;
			}
		}
		System.out.println(sosu);
	}
}