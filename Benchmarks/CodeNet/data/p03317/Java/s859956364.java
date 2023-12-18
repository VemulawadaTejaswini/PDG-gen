import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		String[] strArray = str1.split(" ");
		int maxSize = Integer.parseInt(strArray[0]);
		int num = Integer.parseInt(strArray[1]);
		String[] strArray2 = str2.split(" ");
		int one = 0;
		for(int i=0; i<maxSize-1; i++){
			if(strArray2[i].equals("1")){
				one = i+1;
			}
		}
		int sysoutNum = 0;
		if(num >= one){
			maxSize -= num;
			sysoutNum = 1;
			while(maxSize > 0){
				maxSize = maxSize - num + 1;
				sysoutNum += 1;
			}
		}else{
			one -= num;
			sysoutNum = 1;
			while(one >= 0){
				one = one - num + 1;
				sysoutNum +=1;
			}
			maxSize = maxSize - one - num + 1;
			sysoutNum += 1;
			while(maxSize > 0){
				maxSize = maxSize - num + 1;
				sysoutNum += 1;
			}
		}
		System.out.println(sysoutNum);
	}
}