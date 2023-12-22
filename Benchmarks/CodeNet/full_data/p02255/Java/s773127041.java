import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int nagasa = scan.nextInt();
		int[] num = new int[nagasa];
		for(int i=0;i<nagasa;i++){
			num[i] = scan.nextInt();
		}
		System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]+" "+num[5]);
		
		for (int i=1;i <= nagasa-1;i++){
			int v = num[i];
			int j = i - 1;
			while(j >= 0 && num[j] > v){
				num[j+1] = num[j];
				j -= 1;
			}
			num[j+1] =v;
			System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]+" "+num[5]);
		}
	}
}