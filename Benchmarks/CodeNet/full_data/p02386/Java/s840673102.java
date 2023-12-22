import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<int[]> list = new ArrayList<int[]>();
	static int intCount = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intLoop = scan.nextInt();
		for(int i = 0; i < intLoop; i++){
			int[] face = new int[6];
			for(int j = 0; j < 6; j++){
				face[j] = scan.nextInt();
			}
			list.add(face);
		}
		/*for(int[] i:list){
			for(int num: i){
				System.out.print(num + " ");
			}
			System.out.println();
		}*/
		outside : for(int i = 0; i < list.size(); i++){
			int[] first = new int[6];
			first = list.get(i);
			for(int j = i + 1; j < list.size(); j++){
				int[] second = new int[6];
				second = list.get(j);
				for(int k = 0; k < 6; k++){
					//?????¢??¨?????´????????¢???????????¨??????
					if(first[0] == second[k]){
						//second?????¢??´??¢
						action0(second, k);
						/*System.out.println("-----------action0-----------");
						System.out.println(first[0] + " " + first[1] + " " + first[2]
								+ " " + first[3] + " " + first[4] + " " + first[5]);
						System.out.println(second[0] + " " + second[1] + " " + second[2] + " "
								+ second[3] + " " + second[4] + " " + second[5]);*/
						if(first[5] == second[5]){
							for(int l = 1; l <= 4; l++){
								if(first[1] == second[l]){
									//second?????¢??´??¢
									action1(second, l);
									/*System.out.println("-----------action1-----------");
									System.out.println(first[0] + " " + first[1] + " " + first[2]
											+ " " + first[3] + " " + first[4] + " " + first[5]);
									System.out.println(second[0] + " " + second[1] + " " + second[2] + " "
											+ second[3] + " " + second[4] + " " + second[5]);*/
									//????????????
									/*if(first[3] == second[4]){
										int intTemp = second[4];
										second[4] = second[3];
										second[3] = intTemp;
									}*/
								}
							}
						}
					}
				}
				//?????¨?????´?????§??????
				if(check(first, second)){
					intCount++;
					break outside;
				}
			}
		}
		if(intCount == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		scan.close();
	}
	//?????????????????¢????????¨????????£?????????
	static void action0(int[] second, int k){
		int intTemp;
		switch(k){
		case 1:
			intTemp = second[0];
			second[0] = second[1];
			second[1] = second[5];
			second[5] = second[4];
			second[4] = intTemp;
			break;
		case 2:
			intTemp = second[0];
			second[0] = second[2];
			second[2] = second[5];
			second[5] = second[3];
			second[3] = intTemp;
			break;
		case 3:
			intTemp = second[0];
			second[0] = second[3];
			second[3] = second[5];
			second[5] = second[2];
			second[2] = intTemp;
			break;
		case 4:
			intTemp = second[0];
			second[0] = second[4];
			second[4] = second[5];
			second[5] = second[1];
			second[1] = intTemp;
			break;
		case 5:
			intTemp = second[0];
			second[0] = second[5];
			second[5] = intTemp;
			intTemp = second[1];
			second[1] = second[4];
			second[4] = intTemp;
			break;
		default:
			break;
		}
	}
	//?????????????????¢????????¢????????£?????????
	static void action1(int[] second, int l){
		int intTemp;
		switch(l){
		case 2:
			intTemp = second[1];
			second[1] = second[2];
			second[2] = second[4];
			second[4] = second[3];
			second[4] = intTemp;
			break;
		case 3:
			intTemp = second[1];
			second[1] = second[3];
			second[3] = second[4];
			second[4] = second[2];
			second[2] = intTemp;
			break;
		case 4:
			intTemp = second[1];
			second[1] = second[4];
			second[4] = intTemp;
			intTemp = second[2];
			second[2] = second[3];
			second[3] = intTemp;
			break;
		default :
		}
	}

	static boolean check(int[] first, int[] second){
		if(first[0] == second[0] && first[1] == second[1] && first[2] == second[2] && first[3] == second[3] && first[4] == second[4] && first[5] == second[5]){
			return true;
		}else{
			return false;
		}
	}
}