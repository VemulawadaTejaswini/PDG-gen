
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[6];
		for(int i = 0; i < list.length; i++){
			list[i] = sc.nextInt();
		}
		int maxMelt = list[0] * list[4];
		int meltedSuger = judge(list[2], list[3], maxMelt);
		int total = list[0]*100 + meltedSuger;
		if(sc != null){
			sc.close();
		}
		System.out.println(total + " " + meltedSuger);

	}

	private static int judge(int c, int d, int maxMelt){
		int meltedSuger = justMax(c, d, maxMelt);
		if(meltedSuger != 0){
			return meltedSuger;
		}
		int cMax = nearMaxByC(c, d, maxMelt);
		int dMax = nearMaxByD(c, d, maxMelt);
		int cdMax = nearMaxByCD(c, d, maxMelt);
		if(cMax < dMax){
			if(dMax < cdMax){
				return cdMax;
			}else{
				return dMax;
			}
		}else{
			if(cMax < cdMax){
				return cdMax;
			}else{
				return cMax;
			}
		}

	}

	private static int nearMaxByCD(int c, int d, int maxMelt){
		int meltedSuger = 0;
		int both = c+d;

		while(meltedSuger+both < maxMelt){
			meltedSuger += both;
		}
		if(meltedSuger == 0)
			return 0;

		while(meltedSuger+d < maxMelt){
			meltedSuger += d;
		}
		while(meltedSuger+c < maxMelt){
			meltedSuger += c;
		}
		return meltedSuger;
	}

	private static int nearMaxByC(int c, int d, int maxMelt){
		int meltedSuger = 0;
		while(meltedSuger+c < maxMelt){
			meltedSuger += c;
		}
		if(meltedSuger == 0)
			return 0;

		while(meltedSuger+d < maxMelt){
			meltedSuger += d;
		}
		return meltedSuger;
	}

	private static int nearMaxByD(int c, int d, int maxMelt){
		int meltedSuger = 0;
		while(meltedSuger+d < maxMelt){
			meltedSuger += d;
		}
		if(meltedSuger == 0)
			return 0;

		while(meltedSuger+c < maxMelt){
			meltedSuger += c;
		}
		return meltedSuger;
	}

	private static int justMax(int c, int d, int maxMelt){
		if(maxMelt%d == 0 || maxMelt%c == 0 || maxMelt%(c+d) == 0){
			return maxMelt;
		}
		return 0;
	}
}