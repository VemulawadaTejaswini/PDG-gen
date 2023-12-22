import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int i;
		int GCD,LCM;
		double[] num = new double[2];
		double[] tmpNum = new double[2];
		double tmp;
		
		while(scan.hasNextInt()){
			for(i=0;i<2;i++){
				num[i] = scan.nextInt();
				tmpNum[i] = num[i];
			}
			
			
			while(num[1] != 0){
				if(num[0] < num[1]){
					tmp = num[0];
					num[0] = num[1];
					num[1] = tmp;
				}
				
				tmp = num[0] - num[1];
				num[0] = num[1];
				num[1] = tmp;
			}
			GCD = (int)num[0];
			LCM = (int)((tmpNum[0]*tmpNum[1])/GCD);
			
			System.out.println(GCD + " " + LCM);
		}
		
		scan.close();
	}
}