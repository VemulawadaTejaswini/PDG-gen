import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String s = sc.next();
        int count_r = 0;
        int count_g = 0;
        int count_b = 0;
        for(int i = 0; i < n; i++){
        	if(s.charAt(i) == 'R'){
            	count_r++;
            }else if(s.charAt(i) == 'G'){
            	count_g++;
            }else{
            	count_b++;
            }
        }
        long ans = (long)count_r * count_g * count_b;
        for(int i = 0; i < n - 2; i++){
        	for(int j = i + 1; j <= n - 2; j++){
                int x = j * 2 - i;
                if(x < n && s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(x) && s.charAt(x) != s.charAt(i)){
                	ans--;
                }
            }
        }
        System.out.println(ans);
	}
}