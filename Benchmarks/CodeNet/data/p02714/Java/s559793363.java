import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int count_r = 0;
        int count_g = 0;
        int count_b = 0;
        for(int i = 0; i < n; i++){
        	if(c[i] == 'R'){
            	count_r++;
            }else if(c[i] == 'G'){
            	count_g++;
            }else{
            	count_b++;
            }
        }
        long ans = count_r * count_g * count_b;
        for(int i = 0; i < n; i++){
        	for(int j = i + 1; j < n; j++){
                int x = j * 2 - i;
            	if(c[i] != c[j] && x < n && c[i] != c[x] && c[j] != c[x]){
                	ans--;
                }
            }
        }
        System.out.println(ans);
	}
}