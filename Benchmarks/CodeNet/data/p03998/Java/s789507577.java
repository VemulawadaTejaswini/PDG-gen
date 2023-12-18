import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Sa = sc.next();
		String Sb = sc.next();
		String Sc = sc.next();
		String flag = "A";
		String result = null;
		List<String> listA = new ArrayList<>(Arrays.asList(Sa.split("")));
		List<String> listB = new ArrayList<>(Arrays.asList(Sb.split("")));
		List<String> listC = new ArrayList<>(Arrays.asList(Sc.split("")));

		do {
			if("A".equals(flag)) {
				if(listA.size() == 0) {
					result = "A";
				} else {
					for(int i = 0; i < listA.size();) {
						if("a".equals(listA.get(i))){
							listA.remove(i);
							continue;
						} else if ("b".equals(listA.get(i))) {
							listA.remove(i);
							flag = "B";
							break;
						} else if ("c".equals(listA.get(i))) {
							listA.remove(i);
							flag = "C";
							break;
						}
					}
				}
			}
			if("B".equals(flag)) {
				if(listB.size() == 0) {
					result = "B";
				} else {
					for(int i = 0; i < listB.size();) {
						if("a".equals(listB.get(i))){
							listB.remove(i);
							flag ="A";
							break;
						} else if ("b".equals(listB.get(i))) {
							listB.remove(i);
							continue;
						} else if ("c".equals(listB.get(i))) {
							listB.remove(i);
							flag = "C";
							break;
						}
					}
				}
			}
			if("C".equals(flag)) {
				if(listC.size() == 0) {
					result = "C";
				} else {
					for(int i = 0; i < listC.size();) {
						if("a".equals(listC.get(i))){
							listC.remove(i);
							flag ="A";
							break;
						} else if ("b".equals(listC.get(i))) {
							listC.remove(i);
							flag = "B";
							break;
						} else if ("c".equals(listC.get(i))) {
							listC.remove(i);
							continue;
						}
					}
				}
			}
		} while(result == null);
		System.out.println(result);
	}
}