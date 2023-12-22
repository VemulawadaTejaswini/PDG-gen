import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String inverseTrigonometricTop = sc.next();//逆三角の一番上
			String inverseTrigonometricBottom = "";
			while(inverseTrigonometricTop.length() > 1){
				for(int i=0;i<inverseTrigonometricTop.length()-1;i++){
					int temp = 0;
					if((temp = Integer.parseInt("" + inverseTrigonometricTop.charAt(i)) +
							   Integer.parseInt("" + inverseTrigonometricTop.charAt(i + 1)))
						     >= 10){
						temp -= 10;
					}
					inverseTrigonometricBottom = inverseTrigonometricBottom + temp;
				}
				inverseTrigonometricTop = inverseTrigonometricBottom;
				inverseTrigonometricBottom = "";
			}
			System.out.println(inverseTrigonometricTop);
		}
	}
}