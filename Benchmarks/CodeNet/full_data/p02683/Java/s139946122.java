import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		long money = 0;
		long minimum =0;
		int[] moneyInfo = new int[n+1];
		long[] rikaidoInfo = new long[m+1];
		List<long[]> sankoshoInfoList = new ArrayList<long[]>();
		List<long[]> sankoshoInfoListkeisanyo = new ArrayList<long[]>();


		for(int i =0;i <n;i++) {
			moneyInfo[i+1] = sc.nextInt();
			money+=moneyInfo[i+1];
			long[] sankoshoInfo = new long[m+1];
			sankoshoInfo[0] = moneyInfo[i+1];
			for(int j =0;j <m;j++) {
				sankoshoInfo[j +1] = sc.nextInt();
				rikaidoInfo[j +1] += sankoshoInfo[j +1];
			}
			sankoshoInfoList.add(sankoshoInfo);
		}
		for(int i=1;i <=m;i++) {
			if(rikaidoInfo[i] < x) {
				System.out.println(-1);
				return;
			}
		}
		for(int i =0;i <n;i++) {
			List<long[]> sankoshoInfoListkeisanyotmp = new ArrayList<long[]>();
			for(int j =0;j <sankoshoInfoListkeisanyo.size();j++) {
				long[] rikaidoInfox = sankoshoInfoListkeisanyo.get(j).clone();

				for(int k = 0; k <=m;k++) {
					rikaidoInfox[k] += sankoshoInfoList.get(i)[k];
				}
				sankoshoInfoListkeisanyotmp.add(rikaidoInfox);
			}
			sankoshoInfoListkeisanyo.addAll(sankoshoInfoListkeisanyotmp);
			sankoshoInfoListkeisanyotmp.clear();
			sankoshoInfoListkeisanyo.add(sankoshoInfoList.get(i));
		}
		for(long[] info:sankoshoInfoListkeisanyo) {
			boolean flag = true;
			for(int i = 1;i <=m;i++) {
				if(info[i] < x) {
					flag = false;
					break;
				}
			}
			if(flag){
				if(minimum ==0) {
					minimum = info[0];
				}
				if(minimum > info[0]) {
					minimum = info[0];
				}
			}
		}
		System.out.println(minimum);

	}
}