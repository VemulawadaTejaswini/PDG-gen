import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean followRulesFlg = true;
		ArrayList<String> strings = new ArrayList<>();
		
		for(int a = 0; a<N; a++){
			strings.add(sc.next());
		}
		sc.close();
		for(int a = 0; a<strings.size()-1; a++){
			int b = a+1;
			if(strings.get(a).charAt(strings.get(a).length()-1)!=strings.get(b).charAt(0)){
				followRulesFlg=false;
			}
		}
		Collections.sort(strings);
		for(int a = 0; a<strings.size()-1; a++){
			int b = a+1;
			if(strings.get(a).equals(strings.get(b))){
				followRulesFlg=false;
			}
		}
		System.out.println(followRulesFlg? "Yas" : "No");
	}
}