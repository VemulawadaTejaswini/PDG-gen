import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int value, change;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		while(read()){
			slove();
		}
	}
	static boolean read(){
		value = sc.nextInt();
		if(value == 0){
			return false;
		}
		return true;
	}
	static void slove(){
		//System.out.println(value);
		change = 1000 - value;
		int count = 0;
		while(change > 0){
			if(change >= 500){
				change -= 500;
				count++;
			}else if(change >= 100){
				change -= 100;
				count++;
			}else if(change >= 50){
				change -= 50;
				count++;
			}else if(change >= 10){
				change -= 10;
				count++;
			}else if(change >= 5){
				change -= 5;
				count++;
			}else if(change >= 1){
				change -= 1;
				count++;
			}
		}
		System.out.println(count);
	}
}