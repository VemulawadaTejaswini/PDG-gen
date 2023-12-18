import java.util.Scanner;
	
	public class Main{
		
		static int diffStr(String s){
			int n = s.length();
			int i = 0;
			int a = 0;
			int b = n-1;int count = 0;
			while(i!=n/2){
				if(s.charAt(a)!=s.charAt(b)){
					count++;
					}
				a++;b--;
				i++;
				}
			return count;
		}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(diffStr(s));
		}
	} 