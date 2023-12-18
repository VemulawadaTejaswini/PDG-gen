import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		List<String> sList = Arrays.asList(S.split(""));
		List<Integer> changeCntList = new ArrayList<>();
		Integer wCnt = new Integer(((Long)sList.stream().filter(j -> "W".equals(j)).count()).toString());
		Integer eCnt = new Integer(((Long)sList.stream().filter(j -> "E".equals(j)).count()).toString());
		int tmpWCnt = 0;
		int tmpECnt = eCnt;
		changeCntList.add(tmpWCnt + tmpECnt);

		for (int i=1; i<N-1; i++) {
			if ("W".equals(sList.get(i-1))) {
				tmpWCnt++;
			} else {
				tmpECnt--;
			}
			changeCntList.add(tmpWCnt + tmpECnt);
		}

		Optional<Integer> min = changeCntList.stream().min((a, b) -> a.compareTo(b));
		System.out.println(min.orElse(0));
	}
}

