import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rowNum = sc.nextInt();
		int colNum = sc.nextInt();
		String line = sc.nextLine();
		List<String> map = new ArrayList<>();
		for(int i = 0; i < rowNum; i++) {
			line = sc.nextLine();
			if(line.contains("#")) {
				map.add(line);
			} else {
				rowNum--;
				i--;
			}
		}
		for(int i = 0; i < colNum; i++) {
			boolean empty = true;
			for(String str : map) {
				if(str.charAt(i) == '#') {
					empty = false;
					break;
				}
			}
			if(empty) {
				for(int j = 0; j < rowNum; j++) {
					String str;
					if(i+1 >= colNum) {
						str = map.get(j).substring(0, i);
					}else {
						str = map.get(j).substring(0, i) + map.get(j).substring(i + 1);
					}
					map.set(j, str);
				}
				i--;
				colNum--;
			}
		}

		for(String str : map) {
			System.out.println(str);
		}
	}
}


