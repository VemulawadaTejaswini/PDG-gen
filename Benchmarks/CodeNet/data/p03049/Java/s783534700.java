import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ss = new String[n];
		for(int i=0; i<n; i++){
			ss[i] = sc.next();
		}
		
		int last_a = 0;
		int first_b = 0;
		int first_and_last = 0;
		
		for(int i=0; i<n; i++){
			String[] str = ss[i].split("");
			if(str[0].equals("B")){
				if(str[str.length-1].equals("A")){
					first_and_last++;
				}
				else{
					first_b++;
				}
			}
			else if(str[str.length-1].equals("A")){
				last_a++;
			}
			for(int j=0; j<str.length-1; j++){
				if(str[j].equals("A") && str[j+1].equals("B")){
					ans++;
				}
			}
		}
		
		if(last_a == 0 && first_b == 0){
			if(first_and_last > 0){
				ans += first_and_last - 1;
			}
		}
		else{
			ans += Math.min(last_a, first_b) + first_and_last;
		}
		
		System.out.println(ans);
	}
}
