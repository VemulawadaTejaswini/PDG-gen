import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		ArrayList<String> list1 = new ArrayList<String>();
		int[] list2 = new int[3001];
		int[] list3 = new int[3001];
		int i = 0;
		while (true) {
			list1.add(br.readLine());

			list2[i] = Integer.parseInt(SubStringStart(list1.get(i)));//???????????°???
			list3[i] = Integer.parseInt(SubStringEnd(list1.get(i)));//????°??????°???
			if (list2[i] == 0 && list3[i] == 0) {
				for (int k = 0; k < list1.size(); k++) {
					if (list2[k] > list3[k]) {
						System.out.println(list3[k] + " " + list2[k]);
					} else if (list2[k] < list3[k]) {
						System.out.println(list2[k] + " " + list3[k]);
					} else if (list2[k] == list3[k] && list2[k] != 0 && list3[k] != 0) {
						System.out.println(list2[k] + " " + list3[k]);
					}
				}
				break;
			}
			i = i + 1;
		}
	}

	public static String SubStringStart(String str) {
		int index = str.indexOf(" ");
		return (str.substring(0, index));
	}

	public static String SubStringEnd(String str) {
		int index = str.indexOf(" ");
		return (str.substring(index + 1));
	}
}
//class Main {
//	public static void main(String[] args) throws Exception {
//		InputStreamReader is = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(is);
//
//		String[] list1 = new String[3001];
//		int[] list2 = new int[3001];
//		int[] list3 = new int[3001];
//		int i = 0;
//		while (true) {
//			list1[i] = br.readLine();
//
//			list2[i] = Integer.parseInt(SubStringStart(list1[i]));//???????????°???
//			list3[i] = Integer.parseInt(SubStringEnd(list1[i]));//????°??????°???
//			if (list2[i] == 0 || list3[i] == 0) {
//				for (int k = 0; k < list1.length; k++) {
//					if (list2[k] > list3[k]) {
//						System.out.println(list3[k] + " " + list2[k]);
//					} else if(list2[k] < list3[k]){
//						System.out.println(list2[k] + " " + list3[k]);
//					}else if(list2[k] == list3[k]|| list2[k]!=0|| list3[k]!=0){
//						System.out.println(list2[k] + " " + list3[k]);
//					}
//				}
//				break;
//			}
//			i = i + 1;
//		}
//	}
//
//	public static String SubStringStart(String str) {
//		int index = str.indexOf(" ");
//		return (str.substring(0, index));
//	}
//
//	public static String SubStringEnd(String str) {
//		int index = str.indexOf(" ");
//		return (str.substring(index + 1));
//	}
//}