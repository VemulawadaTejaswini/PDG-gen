import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap <String,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
			char [] c = sc.next().toCharArray();
			Arrays.sort(c);
			m.merge(String.valueOf(c),1,Integer::sum);
		}
        System.out.println(m.values().stream().mapToLong(i->(long)(i-1)*i/2).sum());
	}
}