import java.util.*;

public class Main {

	private static Long[] getStrings(Scanner sc, long num) {
		Long[] stringList = new Long[(int) num];
		int i =0;
		while(num>0) {
			long nextInt = sc.nextLong();
			stringList[i] = nextInt;
			num--;
			i++;
		}
		return stringList;
	}


	static class MyComparator implements Comparator<Long>{
     @Override
     public int compare(Long o1, Long o2) {
		 if(o1 < o2) {
				 return 1;
			 }else if(o1 > o2) {
				 return -1;
			 }else {
				 return 0;
			 }
		 }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		Long[] aArray = getStrings(sc, a);
		Long[] bArray = getStrings(sc, b);
		Long[] cArray = getStrings(sc, c);
		Comparator cmp = new MyComparator();
		Arrays.sort(aArray, cmp);
		Arrays.sort(bArray, cmp);
		Arrays.sort(cArray, cmp);

		long sum = 0;
		int i =0;
		int j =0;
		int k =0;
		while (x > 0 || y >0){
			if (k < c) {
				if (x>0 && y>0) {
					if (aArray[i] >= cArray[k] && bArray[j] >= cArray[k]) {
						sum+=aArray[i];
						sum+=bArray[j];
						i++;
						j++;
						x--;
						y--;
						continue;
					} else if (aArray[i] >= cArray[k]) {
						sum+=aArray[i];
						sum+=cArray[k];
						i++;
						k++;
						x--;
						y--;
						continue;
					} else if (bArray[j] >= cArray[k]) {
						sum+=bArray[j];
						sum+=cArray[k];
						j++;
						k++;
						x--;
						y--;
						continue;
					} else if (aArray[i] >= bArray[j]) {
						sum+=aArray[i];
						sum+=cArray[k];
						i++;
						k++;
						x--;
						y--;
						continue;
					} else {
						sum+=bArray[j];
						sum+=cArray[k];
						j++;
						k++;
						x--;
						y--;
						continue;
					}
				} else if (x>0) {
					if (aArray[i] >= cArray[k]) {
						sum+=aArray[i];
						i++;
					} else {
						sum+=cArray[k];
						k++;
					}
					x--;
					continue;
				} else {
					if (bArray[j] >= cArray[k]) {
						sum+=bArray[j];
						j++;
					} else {
						sum+=cArray[k];
						k++;
					}
					y--;
					continue;
				}

			} else {
				if (x >0 && y>0) {
					sum+=aArray[i];
					sum+=bArray[j];
					i++;
					j++;
					x--;
					y--;
					continue;
				} else if (x>0) {
					sum+=aArray[i];
					i++;
					x--;
					continue;
				} else {
					sum+=bArray[j];
					j++;
					y--;
					continue;
				}

			}

		}
		System.out.println(sum);
	}

}
