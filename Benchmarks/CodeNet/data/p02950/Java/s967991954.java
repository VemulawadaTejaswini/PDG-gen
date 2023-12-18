import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.exec();
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int p = Integer.parseInt(sc.nextLine());
		String[] strArr = sc.nextLine().split(" ");
		sc.close();
		int[] aArr = new int[p];
		for(int i = 0; i < p ; i++) {
			aArr[i] = Integer.parseInt(strArr[i]);
		}
		
		int[] factArr = new int[p];
		int[] recipFactArr = new int[p]; 
		
		factArr[0] = 1;
		recipFactArr[0] = 1; 
		makeFactArr(factArr, p);
		makeRecipFactArr(recipFactArr,p,factArr[factArr.length - 1]);
		
		int[] coefArr = new int[p];
		for(int i = 0; i < p; i++) {
			if(aArr[i] == 0) {
				continue;
			}
			coefArr[p - 1] = mod(coefArr[p - 1] - 1,p);
			int powValue = 1;
			for(int j = 1; j <= p - 1; j++) {
				powValue = mod(powValue * (-i),p);
				int addValue;
				int factValue = mod(mod(factArr[p - 1] * recipFactArr[j],p) * recipFactArr[p - 1 - j], p);
				addValue = mod(factValue * powValue,p);
				
				coefArr[p - 1 - j] = mod(coefArr[p - 1 - j] - addValue,p);
			}
			coefArr[0] = mod(coefArr[0] + 1, p);
//			System.out.println(Arrays.toString(coefArr));
		}
		
		for(int i = 0; i < p; i++) {
			System.out.print(coefArr[i]);
			if(i == p - 1) {
				System.out.print("\n");
			}else {
				System.out.print(" ");
			}
		}
		System.out.flush();
	}
	
	public long fact(long n) {
		long result = 1;
		for(long i = 1;i <= n;i++ ) {
			result *= i;
		}
		return result;
	}
	
	public void makeFactArr(int[] factArr, int base) {
		for(int i = 1; i < factArr.length; i++) {
			factArr[i] = mod(factArr[i-1] * i, base);
 		}
	}
	
	public void makeRecipFactArr(int[] recipFactArr, int base, int lastFactVal) {
		recipFactArr[recipFactArr.length - 1] = makePowWithBase(lastFactVal, base - 2, base);
		for(int i = recipFactArr.length - 1; i > 0; i--) {
			recipFactArr[i - 1] = mod(recipFactArr[i]*i,base);
		}
	}
	
	public int makePowWithBase(int value, int time, int base) {
		int retVal = 1;
		for(int i = 0; i < time; i++) {
			retVal = mod(retVal * value,base);
		}
		return retVal;
	}
	
	public int munusSurplus(int value, int base) {

		int invValue = value * (-1);
		if(invValue % base == 0) {
			return 0;
		}
		int x = invValue / base;
		return value + ((x + 1) * base);
	}
	
	public int mod(int value, int base) {
		if(value < 0) {
			return munusSurplus(value, base);
		}else {
			return value % base;
		}
	}

}