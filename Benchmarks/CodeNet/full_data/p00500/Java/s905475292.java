import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mem=sc.nextInt();
		int[][] ten=new int[mem][3];
		boolean deki=true;
		for(int i=0; i<mem; i++) {
			for(int j=0; j<3; j++) {
				ten[i][j]=sc.nextInt();
			}
		}
		int[] point=new int[mem];
		for(int i=0; i<mem; i++) {
			point[i]=0;
		}
		for(int i=0; i<3; i++) {
			deki=true;
			for(int j=0; j<mem; j++) {
				deki=true;
				for(int k=0; k<mem; k++) {
					if(k==j) {
						//
					}
					else {
						if(ten[j][i]==ten[k][i]) {
							deki=false;
							break;
						}
					}
				}
				if(deki==true) {
					point[j]+=ten[j][i];
				}
			}
		}
		for(int i=0; i<mem; i++) {
			System.out.println(point[i]);
		}
	}
}

