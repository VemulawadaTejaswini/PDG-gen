import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		while(!str1.equals(".")){
			String str2 = scan.nextLine();
			if(str1.equals(str2)){
				System.out.println("IDENTICAL");
			}else{
				int dcnt1 = 0;
				int dcnt2 = 0;
				int i = 0;
				int j = 0;
				String tmp1;
				String tmp2;
				int start1 = 0;
				int start2 = 0;
				int cnt = 0;
				while(i < str1.length() || j < str2.length()){
					while(true){
						if(i >= str1.length()){
							tmp1 = null;
							break;
						}else if(i == str1.length() - 1){
							tmp1 = str1.substring(start1, i + 1);
							i++;
							break;
						}else if(str1.charAt(i) == '"'){
							tmp1 = str1.substring(start1, i + 1);
							start1 = i + 1;
							dcnt1++;
							i++;
							break;
						}
						i++;
					}
					while(true){
						if(j >= str2.length()){
							tmp2 = null;
							break;
						}else if(j == str2.length() - 1){
							tmp2 = str2.substring(start2, j + 1);
							j++;
							break;
						}else if(str2.charAt(j) == '"'){
							tmp2 = str2.substring(start2, j + 1);
							start2 = j + 1;
							dcnt2++;
							j++;
							break;
						}
						j++;
					}
					if(tmp1 == null || tmp2 == null){
						System.out.println("DIFFERENT");
						break;
					}else if(!tmp1.equals(tmp2) && dcnt1%2 == 1){
						System.out.println("DIFFERENT");
						break;
					}else if(!tmp1.equals(tmp2)){
						cnt++;
						if(cnt > 1){
							System.out.println("DIFFERENT");
							break;
						}
					}
				}
				if(cnt == 1){
					System.out.println("CLOSE");
				}else if(i == str1.length() && j == str2.length()){
					System.out.println("DIFFERENT");
				}
			}
			str1 = scan.nextLine();
		}
	}
}
