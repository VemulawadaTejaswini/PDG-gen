import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans=0;
		int a=0;
		int b=0;
		for(int i = 0; i<n; i++){
			String s = sc.next();
			for(int j=0; j<s.length(); j++){
				if(j==0){
					if(s.charAt(j)=='B'){
						b++;
					}
				}
				if(j==s.length()-1){
					if(s.charAt(j)=='A'){
						a++;
					}
					break;
				}
				if(s.charAt(j)=='A' && s.charAt(j+1)=='B'){
					ans++;
				}
			}
		}
		System.out.println(ans+Math.min(a,b));
	}
}
