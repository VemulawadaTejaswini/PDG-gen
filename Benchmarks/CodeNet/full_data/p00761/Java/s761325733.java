import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,l=0;
		int as=0,am=0; // テ・ツ、ツァテ」ツ?催」ツ??ヲツ閉ーテ」ツ?ィテ・ツーツ湘」ツ?陛」ツ??ヲツ閉ーテァツ板ィ

		while(sc.hasNext()){
			a = sc.nextInt();
			l = sc.nextInt();
			
			if(a == 0 && l == 0) break;
			
			int[] array = new int[l];

			// 20テ・ツ崢榲ァツケツーテ」ツつ甘ィツソツ氾」ツ?凖」ツ?づァツュツ氾」ツ?暗」ツ?古・ツ?コテ」ツ?淌」ツつ叡reak
			
			int[] result = new int[21];
			result[0] = a;
			for(int i = 1;i<result.length;i++){
				makeArray(array,a); // テ」ツ?禿」ツ?禿」ツ?ァテゥツ?催・ツ按療」ツつ津」ツ?、テ」ツ?湘」ツ?」テ」ツ?ヲ
				Arrays.sort(array); // テ」ツ?禿」ツ?禿」ツ?ァテ、ツクツヲテ」ツ?ウテヲツ崢ソテ」ツ?暗」ツ?ヲ
				am = makeAM(array); // テ・ツ、ツァテ」ツ?催」ツ??」ツ?ョテ」ツ?、テ」ツ?湘」ツ?」テ」ツ?ヲ
				as = makeAS(array); // テ・ツーツ湘」ツ?陛」ツ??」ツ?ョテ」ツつづ」ツ?、テ」ツ?湘」ツ?」テ」ツ?ヲ
				a = Math.abs(am - as);
				result[i] = a;
				if(isSolved(result,i)!=-1){
					System.out.print(isSolved(result,i) + " " + result[i] + " " + (i - isSolved(result,i)));
					break;
				}
			}
			
			System.out.println();
		}
		
	}
	
	// テ・ツ、ツァテ」ツ?催」ツ??ゥツ??
	static int makeAM(int[] array){
		int m = 1;
		int am = 0;
		for(int i = array.length-1;i>=0;i--){
			am += array[i]*m;
			m *= 10;
		}
		return am;
	}
	
	// テ・ツーツ湘」ツ?陛」ツ??ゥツ??
	static int makeAS(int[] array){
		int m = 1;
		int am = 0;
		for(int i = 0;i<array.length;i++){
			am += array[i]*m;
			m *= 10;
		}
		return am;
	}

	// テゥツ?催・ツ按療」ツ?ォテ」ツ?敕」ツつ古」ツ?榲」ツつ古・ツ?・テ」ツつ古」ツ?ヲテ」ツ??
	static void makeArray(int[] array,int a){
		for(int i = 0;i<array.length;i++){
			array[i] = a%10;
			a /= 10;
		}
	}
	
	// テ・ツ青古」ツ?佚ヲツ閉ーテ・ツュツ療」ツ?古」ツ?づ」ツつ凝」ツ?凝」ツ?ゥテ」ツ??」ツ?凝・ツ?ィテゥツδィテ」ツ?ソテ」ツ?ヲテ」ツ??
	static int isSolved(int[] result,int n){
		for(int i = 0;i<n;i++){
			if(i!=n && result[i]==result[n]) return i;
		}
		return -1;
	}
}