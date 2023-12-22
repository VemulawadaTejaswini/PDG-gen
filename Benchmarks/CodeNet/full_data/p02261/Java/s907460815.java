import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static int N; //static?????´??°???public static???main?????????????????§????????????????????????

	public static void main(String[] args){

		N = scan.nextInt();
		String[] cards = new String[N];
		String[] copys = new String[N];
		String[] ins = new String[N];
		for(int i = 0; i < N; i++){
			cards[i] = scan.next();
			copys[i] = cards[i];
			ins[i] = cards[i];
		}

		//?????????????????????????????????????????????
		for(int i = 0; i < N; i++){
			for(int j = N-1; j >= i+1; j--){
				String sj = cards[j].substring(1);
				String sjj = cards[j-1].substring(1);
				int vj = Integer.parseInt(sj);
				int vjj = Integer.parseInt(sjj);
				if(vj < vjj){
					String work = cards[j];
					cards[j] = cards[j-1];
					cards[j-1] = work;
				}
			}
		}

		for(int i = 0; i < N; i++)
			System.out.printf(i != N-1? "%s " : "%s\n", cards[i]);
		System.out.printf("%s\n", Arrays.equals(ins, carsd)? "Stable" : "Not stable");

		//???????????????
		for(int i = 0; i < N; i++){
			int minj = i;
			for(int j = i; j < N; j++){
				String sj = copys[j].substring(1);
				String sjj = copys[minj].substring(1);
				int vj = Integer.parseInt(sj);
				int vjj = Integer.parseInt(sjj);
				if(vj < vjj)
					minj = j;
			}
			//?????????????????????minj??¨i???????????????
			if(minj != i){
				String work = copys[minj];
				copys[minj] = copys[i];
				copys[i] = work;
			}
		}

		for(int i = 0; i < N; i++)
			System.out.printf(i != N-1? "%s " : "%s\n", copys[i]);
		System.out.printf("%s\n", Arrays.equals(ins, copys)? "Stable" : "Not stable");
	}
}