import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long ans = 0;
		HashMap<String,long> m = new HashMap<>();

		for(int i=0;i<n;i++){
			char [] c = sc.next().toCharArray();
			Arrays.sort(c);
			m.merge(String.valueOf(c),1,long::sum);
	    }
        
        for(long i : m){ans+=i*(i-1)/2;}
		System.out.println(ans);
	}
}
