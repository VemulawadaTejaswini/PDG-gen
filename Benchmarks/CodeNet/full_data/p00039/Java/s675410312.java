import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static int RomanToArabic(char roman){
		int arabic = 0;
		switch(roman){
		case 'I':
			arabic = 1;
			break;
		case 'V':
			arabic = 5;
			break;
		case 'X':
			arabic = 10;
			break;
		case 'L':
			arabic = 50;
			break;
		case 'C':
			arabic = 100;
			break;
		case 'D':
			arabic = 500;
			break;
		case 'M':
			arabic = 1000;
			break;
		default:
			arabic = 0;
			break;
		}
		return arabic;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] str;
		
		while(scan.hasNext()){
			str = scan.next().toCharArray();
			
			//大きい数字の前にあって引き算を表す
			//小さな数字は一回の引き算あたりひとつしかありません
			int sum=0;	//全体の和
			int num=0;	//部分和
			char buf = str[0];
			num += RomanToArabic(buf);
			for(int i=1; i<str.length; ++i){
				if(RomanToArabic(buf) < RomanToArabic(str[i])){
					sum -= num;
					num = 0;
				}else if(RomanToArabic(buf) > RomanToArabic(str[i])){
					sum += num;
					num = 0;
				}
				buf = str[i];
				num += RomanToArabic(buf);
			}
			sum += num;
			
			System.out.println(sum);
		}
	}
}