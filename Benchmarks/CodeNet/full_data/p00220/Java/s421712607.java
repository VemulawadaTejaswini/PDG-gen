import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	static double[] shou ={0.0, 0.5,0.25,0.125,0.0625};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		label:while(true){
			double d = cin.nextDouble();
			if(d < 0.0){
				break;
			}
			int dd = (int)d;
			String seisuubu = Integer.toBinaryString(dd);
			if(seisuubu.length() > 8){
				System.out.println("NA");
				continue;
			}
			d = d - (double)dd;
			//System.out.println(d + " " + dd);
			for(int i = seisuubu.length();i<8;i++){
				seisuubu = "0"+seisuubu;
			}
			for(int i = 0;i<4;i++){
				for(int j = i+1;j<4;j++){
					if(d==shou[i]+shou[j]){
						System.out.print(seisuubu + ".");
						for(int k=1;k<=4;k++){
							if(k==i||k==j){
								System.out.print("1");
							}
							else{
								System.out.print("0");
							}
						}
						System.out.println();
						continue label; 
					}
				}
			}
			System.out.println("NA");
		}

	}

}