import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[4];
		int[] b = new int[4];
		int hit,blow,i;
		
		while(scan.hasNextInt()){
			for(i=0;i<4;i++){
				a[i] = scan.nextInt();
			}
			for(i=0;i<4;i++){
				b[i] = scan.nextInt();
			}
			hit = 0;
			blow = 0;
			
			for(i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(a[i] == b[j]){
						if(i == j){
							hit++;
						}else{
							blow++;
						}
					}
				}
			}
			
			System.out.println(hit + " " + blow);
		}
	}
}