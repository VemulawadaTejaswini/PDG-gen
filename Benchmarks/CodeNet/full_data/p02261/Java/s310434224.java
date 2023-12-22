import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		String[] values = new String[cnt];

		for(int i=0 ; i<cnt ; i++) {
			values[i] = s.next();
		}
		String[] before = (String[]) values.clone();
		String[] v = (String[]) values.clone();

		bubbleSort(values);
		checkStable(before, values);
		selectionSort(v);
		checkStable(before, v);
	}

	public static void bubbleSort(String[] values){
		for(int i=0 ; i<values.length ; i++) {
			for(int j = values.length-1 ; j > i ; j--) {
				if(new Integer(values[j].substring(1, 2)).intValue() < new Integer(values[j-1].substring(1, 2)).intValue()) {
					String tmp = values[j-1];
					values[j-1] = values[j];
					values[j] = tmp;
				}
			}
		}
		String dispStr = "";
		for(int i=0 ; i<values.length ; i++) {
			if(i != values.length - 1)
				dispStr += values[i] + " ";
			else
				dispStr += values[i];
		}
		System.out.println(dispStr);
	}

	public static void selectionSort(String[] values) {
		for(int i=0 ; i<values.length ; i++) {
			int mini = i;
			for(int j=i ; j<values.length ; j++) {
				if(new Integer(values[mini].substring(1, 2)).intValue() > new Integer(values[j].substring(1, 2)).intValue()) {
					mini = j;
				}
			}
			String tmp = values[mini];
			values[mini] = values[i];
			values[i] = tmp;
		}
		String dispStr = "";
		for(int i=0 ; i<values.length ; i++) {
			if(i != values.length - 1)
				dispStr += values[i] + " ";
			else
				dispStr += values[i];
		}
		System.out.println(dispStr);
	}

	public static void checkStable(String[] before, String[] after) {
		String[] beforeSuit = new String[4];
		String[] afterSuit = new String[4];

		for(int i=1 ; i<10 ; i++) {
			int beforeIndex = 0;
			int afterIndex = 0;
			for(int j=0 ; j<before.length ; j++) {
				if(i == new Integer(before[j].substring(1, 2)).intValue()) {
					beforeSuit[beforeIndex] = before[j].substring(0, 1);
					beforeIndex++;
				}
			}

			for(int k=0 ; k<after.length ; k++) {
				if(i == new Integer(after[k].substring(1, 2)).intValue()) {
					afterSuit[afterIndex] = after[k].substring(0, 1);
					afterIndex++;
				}
			}

			for(int l=0 ; l<4 ; l++) {
				if(beforeSuit[l] == null || afterSuit[l] == null)
					continue;
				if(! beforeSuit[l].equals(afterSuit[l])) {
					System.out.println("Not stable");
					return;
				}
			}
			beforeSuit = new String[4];
			afterSuit = new String[4];
		}
		System.out.println("Stable");
	}
}