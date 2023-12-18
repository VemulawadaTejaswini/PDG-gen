import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numOfChar = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		int sysoutResult = 0;
		for(int i = 1; i < numOfChar-1; i++){
			String str0 = str.substring(0,i);
			String str1 = str.substring(i + 1,numOfChar);
			String[] inputStr0 = str0.split("");
			String[] inputStr1 = str1.split("");
			
			int count0 = 0;
			int count1 = 0;
			int count2;
			for(int ii = 0; ii < i; ii++){
				int result = inputStr0[ii].indexOf("W");
				if(result != -1){
					count0 = count0 + 1;
				}
			}
			for(int iii = 0; iii < numOfChar - i -1; iii++){
				int result = inputStr1[iii].indexOf("E");
				if(result != -1){
					count1 = count1 + 1;
				}
			}
			count2 = count0 + count1;
			if(sysoutResult == 0){
				sysoutResult = count2;
			}else if(sysoutResult > count2){
				sysoutResult = count2;
			}
		}
		System.out.println(sysoutResult);
	}
}