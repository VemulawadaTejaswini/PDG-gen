import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long ans = 0;
		HashMap<String,Integer> m = new HashMap<>();

		for(int i=0;i<n;i++){
			char [] c = sc.next().toCharArray();
			Arrays.sort(c);
			m.merge(String.valueOf(c),1,Integer::sum);
	    }
        
        for(Integer i : m){ans+=i*(i-1)/2;}
		System.out.println(ans);
	}
}