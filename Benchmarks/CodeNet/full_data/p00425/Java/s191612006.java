import java.util.Scanner;

public class Main{
	public static void moveNorth(int[] num){
		int temp1 = num[0];
		int temp2 = num[1];
		int temp3 = num[5];
		int temp4 = num[3];
		num[0] = temp4;
		num[3] = temp3;
		num[5] = temp2;
		num[1] = temp1;
	}
	
	public static void moveSouth(int[] num){
		int temp1 = num[0];
		int temp2 = num[3];
		int temp3 = num[5];
		int temp4 = num[1];
		num[0] = temp4;
		num[1] = temp3;
		num[5] = temp2;
		num[3] = temp1;
	}
	
	public static void moveEast(int[] num){
		int temp1 = num[0];
		int temp2 = num[2];
		int temp3 = num[5];
		int temp4 = num[4];
		num[0] = temp4;
		num[4] = temp3;
		num[5] = temp2;
		num[2] = temp1;
	}
	
	public static void moveWest(int[] num){
		int temp1 = num[0];
		int temp2 = num[4];
		int temp3 = num[5];
		int temp4 = num[2];
		num[0] = temp4;
		num[2] = temp3;
		num[5] = temp2;
		num[4] = temp1;
	}
	
	public static void moveRight(int[] num){
		int temp1 = num[1];
		int temp2 = num[2];
		int temp3 = num[3];
		int temp4 = num[4];
		num[1] = temp4;
		num[4] = temp3;
		num[3] = temp2;
		num[2] = temp1;
	}
	
	public static void moveLeft(int[] num){
		int temp1 = num[1];
		int temp2 = num[4];
		int temp3 = num[3];
		int temp4 = num[2];
		num[1] = temp4;
		num[2] = temp3;
		num[3] = temp2;
		num[4] = temp1;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] num = new int[6];
		//ceil = 0; north = 1; east = 2; south = 3; west = 4; floor = 5;
		
		int[] result = new int[1000];
		int index = 0;
		while( n != 0 ){
			String[] direct = new String[n];
			int sum = 1;
			num[0] = 1;
			num[1] = 5;
			num[2] = 3;
			num[3] = 2;
			num[4] = 4;
			num[5] = 6;
			for(int i = 0; i < n; i++){
				direct[i] = stdIn.next();
				switch(direct[i]){
					case "North" : moveNorth(num);break;
					case "East"  : moveEast(num);break;
					case "South" : moveSouth(num);break;
					case "West"  : moveWest(num);break;
					case "Right" : moveRight(num);break;
					case "Left"  : moveLeft(num);break;
				}
				sum += num[0];
			}
			result[index] = sum;
			index++;
			n = stdIn.nextInt();
		}
		
		for(int i = 0; i < index; i++){
			System.out.println(result[i]);
		}
	}
}