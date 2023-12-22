import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] first = new int[26];
			int[] end = new int[26];
			String str;
			for(int i = 0;i < n;i++){
				str = scan.next();
				first[str.charAt(0)-'a']++;
				end[str.charAt(str.length()-1)-'a']++;
			}
			int count = 0;
			for(int i = 0;i < 26;i++){
				if(first[i] != end[i]){
					count++;
					if(count >= 2){
						break;
					}
				}
			}
			System.out.println((count>=2)?"NG":"OK");
		}
	}
}