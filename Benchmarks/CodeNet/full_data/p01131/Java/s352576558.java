import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] dic = new String[9];
		dic[0] = ".,!? ";
		dic[1] = "abc";
		dic[2] = "def";
		dic[3] = "ghi";
		dic[4] = "jkl";
		dic[5] = "mno";
		dic[6] = "pqrs";
		dic[7] = "tuv";
		dic[8] = "wxyz";
		while(scan.hasNext()){
			int n = scan.nextInt();
			String str = "";
			int count;
			boolean fl;
			int t;
			int tt;
			int j;
			for(int i = 0;i < n;i++){
				str = scan.next();
				count = 0;
				fl = false;
				t = 0;
				tt = 0;
				j = 0;
				while(j < str.length()){
					t = Integer.parseInt(str.charAt(j)+"");
					j++;
					if(t == 0){
						if(fl){
							System.out.print(dic[tt].charAt(count%(dic[tt].length())));
							fl = false;
							count = 0;
						}
					}else if(!fl){
						tt = t-1;
						fl = true;
					}else{
						count++;
					}
				}
				System.out.println("\n");
			}
		}
	}
}