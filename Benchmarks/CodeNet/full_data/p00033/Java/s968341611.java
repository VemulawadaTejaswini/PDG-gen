import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int ball;
		int[] a = new int[10], b = new int[10];
		int anum, bnum;
		
		for(int i = 0; i < n; i++){
			anum = 0;
			bnum = 0;
			for(int j = 0; j < 10; j++){
				ball = scan.nextInt();
				
				if(a[anum] >= b[bnum]){
					if(a[anum] < ball){
						a[anum] = ball;
						if(anum < 9)anum++;
					}else if(b[bnum] < ball){
						b[bnum] = ball;
						if(bnum < 9)bnum++;
					}else {
						System.out.println("NO");
						break;
					}
				}else{
					if(b[bnum] < ball){
						b[bnum] = ball;
						if(bnum < 9)bnum++;
					}else if(a[anum] < ball){
						a[anum] = ball;
						if(anum < 9)anum++;
					}else {
						System.out.println("NO");
						break;
					}
				}
				if(anum + bnum == 10)System.out.println("YES");
			}
		}
	}
}