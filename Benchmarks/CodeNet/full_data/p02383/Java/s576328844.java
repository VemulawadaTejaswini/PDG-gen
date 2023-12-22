
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		//????????£?????????????????????
		Scanner sc = new Scanner(System.in);
		//
		String[] str = sc.nextLine().split(" ");
		//
		String direction =sc.next();
		
		//?????????????????°??????
		int[] num = new int[6];
		//????????????????????????????????°????????£??\
		for(int i = 0;i<6;i++){
			num[i] = Integer.parseInt(str[i]);
			//System.out.print(num[i]+ " ");
		}
		//
		
		Saikoro sk = new Saikoro(num, direction);
		System.out.println(sk.getSide());
	}
	//Saikoro????????????
	class Saikoro{
		//??£?¨?
	
		char c;
		int tmp;
		int value=0;
	
	public Saikoro(int[] num, String direction){
		for(int i = 0; i<direction.length(); i++){
			c = direction.charAt(i);
			switch(c){
			case 'N':
				tmp = num[0];
				num[0] = num[1];
				num[1] = num[5];
				num[5] = num[4];
				num[4] = tmp;
				
				break;
			case 'W':
				tmp = num[0];
				num[0] = num[2];
				num[2] = num[5];
				num[5] = num[3];
				num[3] = tmp;
				
				break;
			case 'E':
				tmp = num[0];
				num[0] = num[1];
				num[1] = num[5];
				num[5] = num[4];
				num[2] = tmp;
				break;
			case 'S':
				tmp = num[0];
				num[0] = num[1];
				num[1] = num[5];
				num[5] = num[4];
				num[1] = tmp;
				break;
			default:
			}
			value = num[0];
		}
		
	}
	public int getSide(){
		return value;
		}
	}
}