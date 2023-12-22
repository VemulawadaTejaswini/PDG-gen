import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(sc.hasNext()){
			new aoj0077().doIt();
		}
	}
	class aoj0077 {
		char num[] ={'0','1','2','3','4','5','6','7','8','9'};
		StringBuilder build(char ctr[],int length){
			StringBuilder result = new StringBuilder();
			for(int i = 0;i < length;i++){
				if(i < length - 2 && ctr[i] == '@'){
					for(int j = 0;j < 10;j++){
						if(ctr[i + 1] == num[j]){
							for(int k = 0;k < j;k++){
								result.append((char)(ctr[i+2]));
							}
						}
					}
					i = i + 2;
				}else{
					result.append((char)(ctr[i]));
				}
			}
			return result;
		}
		void doIt() {
			String n = sc.next();
			char nctr[] = n.toCharArray();
			System.out.println(build(nctr,nctr.length));
		}
	}
}