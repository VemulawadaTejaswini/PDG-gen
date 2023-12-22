import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(sc.hasNext()){
			new aoj0039().doIt();
		}
	}

	class aoj0039 {
		char num[] = {'M','D','C','L','X','V','I'};
		int num2[] = {1000,500,100,50,10,5,1};
		int result = 0;
		int mainas(char nnum1,char nnum2){
			int result2 = 0;
			for(int i = 0;i < num.length;i++){
				if(nnum1 == num[i])result2 = result2 + i;
				if(nnum2 == num[i])result2 = result2 - i;
			}
			return result2;
		}
		int cnt(char[] nnum,int length){
			if(length == 1){
				for(int i = 0;i < num.length;i++){
					if(nnum[0] == num[i])result = result + num2[i];
				}
			}else if(length > 1){
				for(int i = 0;i < num.length;i++){
					if(nnum[0] == num[i]){
						if(num[i] != num[0] && mainas(nnum[0],nnum[1]) > 0){
							result = result + num2[i - mainas(nnum[0],nnum[1])] - num2[i];
							for(int j = 0;j < nnum.length - 2;j++)nnum[j] = nnum[j+2];
							length = length - 2;
							cnt(nnum,length);
							break;
						}else{
							result = result + num2[i];
							for(int j = 0;j < nnum.length - 1;j++)nnum[j] = nnum[j+1];
							length = length - 1;
							cnt(nnum,length);
							break;
						}
					}
				}
			}
			return result;
		}
		void doIt() {
			String n = sc.next();
			char nnum[] = n.toCharArray();
			result = 0;
			System.out.println(cnt(nnum,nnum.length));
		}
	}
}