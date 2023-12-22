import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void printArray (List<Integer> list){
		StringBuilder sb = new StringBuilder();
		sb.append(list.get(0));
		for (int i = 1; i < list.size();i++) {
			sb.append(" ").append(list.get(i));
		}
		System.out.println(sb.toString());
	}

	public static int howManyIncluded3(List<Integer> sArray, List<Integer> qArray) {

		int howMany = 0;
		qArray.add(1);
		for (int j = 0; j< qArray.size()-1; j++) {
			int key = qArray.get(j);
			qArray.set(qArray.size()-1, key);
			int i = 0;
			while(qArray.get(i) != key) {
				i++;
			}
			if (i == qArray.size()-1) {
				// not found, it reaches to the end
				continue;
			}
			howMany++;
		}
		return howMany;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sNum = sc.nextInt();
		List<Integer> sArrays = new ArrayList<Integer>();
		for (int i = 0; i < sNum; i++) {
			sArrays.add(sc.nextInt());
		}
		List<Integer> qArrays = new ArrayList<Integer>();
		int qNum = sc.nextInt();
		for (int i = 0; i < qNum; i++) {
			qArrays.add(sc.nextInt());
		}
		//List<List<Integer>> arrays = acceptNArray(System.in);
		int howMany = howManyIncluded3(sArrays, qArrays);
		System.out.println(howMany);
	}
}