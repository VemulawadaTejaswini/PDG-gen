import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] whxyr = new int[5];
		for(byte i = 0;i < whxyr.length;i++){
			whxyr[i] = sc.nextInt();
		}
		Calc cl = new Calc();
		cl.calc(whxyr);
		int[] renewWh = {whxyr[0] - whxyr[4], whxyr[1] - whxyr[4], whxyr[2] + whxyr[4], whxyr[3] + whxyr[4]};
		if(renewWh[0] >= 0 && renewWh[1] >= 0 && renewWh[2] <= whxyr[0] && renewWh[3] <= whxyr[1]){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
class Calc{
	public int[] calc(int[] array){
		int tmp;
		for(byte i = 0;i < array.length - 2;i++){
			if(array[i + 2] < 0){
				tmp = array[i];
				array[i] = array[i + 2];
				array[i + 2] = tmp;
			}
		}
		return array;
	}
}
