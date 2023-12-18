import java.util.*;

public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
		int M = sc.nextInt();
		List<String> list = new ArrayList<>();
		for(int i = 0; i < N; i++){
			list.add(sc.next());
		}
		Collections.sort(list);
		for(int j = 0; j < N; j++){
			System.out.println(list.get(j));
		}
	}
}
