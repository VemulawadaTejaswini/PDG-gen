import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		int n = s.length();
		String sub[] = new String[n + (n * (n - 1) / 2)];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int o = i + 1; o <= n; o++) {
				sub[count] = s.substring(i, o);
				count++;
			}
		}Arrays.sort(sub);


int ans=1;
if(k==1){System.out.println(sub[0]);}else{
for(int i=0;i<n-1 + (n * (n - 1) / 2);i++){
if(!sub[i].equals(sub[i+1])){
ans++;
if(ans==k){
	System.out.println(sub[i+1]);
	break;
}
}}

	}
}}