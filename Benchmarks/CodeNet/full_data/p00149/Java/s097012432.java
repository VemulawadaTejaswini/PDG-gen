import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count[][] = new int[2][4];
		while(scan.hasNext()){
			double lr[] = new double[2];
			lr[0] = scan.nextDouble();
			lr[1] = scan.nextDouble();
			for(int i = 0 ; i < 2 ; i++){
				if(lr[i] >= 1.1){
					count[i][0]+=1;
				}else if(lr[i] >= 0.6){
					count[i][1]+=1;
				}else if(lr[i] >= 0.2){
					count[i][2]+=1;
				}else{
					count[i][3]+=1;
				}
			}
		}
		for(int i = 0 ; i < 4 ; i++){
			System.out.println(count[0][i] +" "+ count[1][i]);
		}
	}
}