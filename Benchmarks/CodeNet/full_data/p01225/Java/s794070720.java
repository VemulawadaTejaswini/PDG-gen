import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int N[][] = new int[T][];
		char C[][] = new char[T][];
		for(int j=0;j<T;j++){
			N[j] = new int[9];
			C[j] = new char[9];
			for(int i=0;i<9;i++){
				N[j][i] = scan.nextInt();
			}
			for(int i=0;i<9;i++){
				String str = scan.next();
				char[] inpc = str.toCharArray();
				C[j*2][i] = inpc[1];
			}
		}
		
		char coler[] = {'R','G','B'};

		for(int j=0;j<T;j++){
			int a[] = new int[10];
			int count=0;
			int pea;
			boolean f = false;
			for(int cnum=0;cnum<3;cnum++){
				for(int i=0;i<9;i++){
					if(C[j][i] == coler[cnum]){
						
						a[count]=N[j][i];
						count++;
					}
				}
				if(count>2){
					Arrays.sort(a);
					for(int x=0;a[x+2]==0;x++){
						if((a[x] == a[x+1] && a[x] == a[x+2]) || (a[x] == a[x+1]-1 && a[x] == a[x+2]-2)){
							pea++;
							x+=2;
						}
					}
					if(pea>=3){
						f=true;
					}
				}
			}
			if(f){
				System.out.println("1");
			}else{
				System.out.println("0");
			}
			
		}
	}
}
	
