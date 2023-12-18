    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Map.Entry;
    import java.util.Scanner;
     
    public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Map<Character, Long> map = new HashMap<>();
		String target = sc.next();
		for(int i=0; i < target.length(); i++) {
			char str = target.charAt(i);
			if(map.containsKey(str)) {
				map.put(str, map.get(str) + (long)1);
			}else {
				map.put(str, (long)1);
			}
		}
		List<Long> numList = new ArrayList<>();
		for(Entry<Character, Long> entry : map.entrySet()) {
			long value = entry.getValue();
			numList.add(value);
		}
		long tempAns = 1;
		for(Long eachNum : numList) {
			tempAns = tempAns * (long)(eachNum + 1);
		}
		System.out.println((long)((long)(tempAns - 1) % (long)(Math.pow(10, 9) + 7)));
		sc.close();
	}
}
