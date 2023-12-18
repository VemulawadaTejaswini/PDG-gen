import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String inputNK = scanner.nextLine();
		String[] nkStr = inputNK.split(" ", 0);
		
		String inputP = scanner.nextLine();
		String[] pStr = inputP.split(" ", 0);
		
		int n = Integer.parseInt(nkStr[0]);
		int k = Integer.parseInt(nkStr[1]);
		
		int pInt[] = new int[n];
		for(int i=0;i<n;i++){
			pInt[i] = Integer.parseInt(pStr[i]);
		}
		
		int sum = 0;
		for(int i=0;i<n;i++){
			sum += pInt[i];
		}
		// 平均値
		int ave = sum/n;
		
		// 約数
		int divisor = ave;
		
		// 平均値または最も近い平均値の約数までいくつ差があるかの数列
		int differ[] = new int[n];
		
		divisor = ave+1;
		while(divisor > 1){
			divisor = lesserDivisor(ave, divisor);
			
			for(int i=0;i<n;i++){
				int nearest = pInt[i] - (pInt[i]%divisor);
				if(pInt[i] - nearest > divisor/2){
					nearest += divisor;
				}
				differ[i] = pInt[i] - nearest;
			}
			
			int sumOfUpperThanDiffer = 0;
			for(int i=0;i<n;i++){
				if(differ[i] > 0){
					sumOfUpperThanDiffer += differ[i];
				}
			}
			
			if(sumOfUpperThanDiffer <= k){
				break;
			}
		}
		System.out.println(divisor);
	}
	
	public static int lesserDivisor(int ave, int divisor){
		divisor--;
		while(divisor > 1){
			if(ave%divisor == 0){
				return divisor;
			}
			divisor--;
		}
		if(divisor <= 0){
			divisor = 1;
		}
		return divisor;
	}
}