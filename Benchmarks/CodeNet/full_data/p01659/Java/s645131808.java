//import java.io.File;
import java.util.Scanner;

class Main{
	static int[] arr;
	public static void main(String[] args) {
try{
		//Scanner scan = new Scanner(new File("in.txt"));
		Scanner scan = new Scanner(System.in);


		int input1 = scan.nextInt();
		int[] harr = new int[input1];
		int ite = 0;
		int carpetCount = 0;
		for(int loopcount = 0; loopcount < input1; loopcount++) {
/*
for(int i = 0; i < ite; i++) {
System.out.print(harr[i]);
}
System.out.println(":carpet->"+carpetCount);
*/
			int input2 = scan.nextInt();
			boolean flag = true;
			for(int i = 0; i < ite; i++) {
				if(input2-harr[i] < 0) {
					carpetCount += ite-1;
					ite = i;
					break;
				}
				if(input2-harr[i] == 0) {
					carpetCount += ite-i-1;
					ite = i+1;
					flag = false;
					break;
				}
			}
			if(flag) {
				harr[ite] = input2;
				ite++;
			}
		}
		System.out.println(carpetCount+ite);
		

}catch(Exception e) {
	e.printStackTrace();
}
	}
}