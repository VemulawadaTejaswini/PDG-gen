import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.next();
		char[] c = new char[4];
		
		List<String> list = new ArrayList<>();
        
        for(int i = 0; i < 4; i++){
		    list.add(String.valueOf(S.charAt(i)));
		}
		
		Set<String> set = new HashSet<>(list);
		List<String> list2 = new ArrayList<>(set);
		
		if(list2.size() == 2){
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
        
    }
}