

import java.util.Scanner;

public class Main {
	public static void main(String []args){
		//????????£????????????????????°?????????????????£?¨?
		Scanner sc = new Scanner(System.in);
		while(true){
			//???
			int H = sc.nextInt();
			//?¨?
			int W = sc.nextInt();
			//??\?????????0????????????
			if(H ==0 && W ==0){
				break;
			}
			//???????????¶???
			for(int i =1; i <=H; i++){
				//?¨?????????¶???
				String s = "";
				for(int j =1; j<=W; j++){
					//
					if(i ==1 || i==H || j==1 || j==W){
						s +="#";
					}else{
						s += ".";
					}
				}
				//
				System.out.println(s);
			}
		}
	}
}