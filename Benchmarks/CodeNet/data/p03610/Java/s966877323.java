import java.util.Scanner;

class Main{

	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);

		String string = scanner.next();
		int l = string.length();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i <l-1;i++){
			if(i % 2 == 0){
				sb.append(string.substring(i, i+1));
			}
			
			
		}
		if(l % 2 == 1){
			sb.append(string.substring(l-1));
		}
		System.out.println(sb.toString());
	}


}

class Pair implements Comparable{
	int from;
	int middle;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



