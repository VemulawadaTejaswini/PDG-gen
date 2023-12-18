import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String s[] = new String[a.length()];
		int n[] = new int[a.length()];
		for(int i = 0; i < a.length(); i++){
			s[i] = a.substring(i, i+1);
		}
		int j;
		boolean flg;
		for(int k = 0; k < a.length(); k++){
			if(s[k].equals("R")){
				j = k;
				flg = true;
				while(true){
					if(s[j+1].equals("R")){
						j++;
						flg = !flg;
					}
					else{
						if(flg){
							n[j]++;
						}
						else{
							n[j+1]++;
						}
						break;
					}
				}
			}
			else{
				j = k;
				flg = true;
				while(true){
					if(s[j-1].equals("L")){
						j--;
						flg = !flg;

					}
					else{
						if(flg){
							n[j]++;
						}
						else{
							n[j-1]++;
						}
						break;
					}
				}

			}
		}
		for(int i = 0; i < n.length; i++){
			System.out.print(n[i] + " ");
		}

	}

}