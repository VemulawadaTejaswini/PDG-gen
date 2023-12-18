import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		
		String[] sSplit = s.split("");

		String left = "(";
		String right = ")";

		int leftCnt = 0;
		int rightCnt = 0;

		int topCnt = 0;
		int tailCnt = 0;

		for(int i=0; i<n; i++){
			if(sSplit[i].equals(left)){
				leftCnt++;
			}else if(sSplit[i].equals(right)){
				while(true){
					rightCnt++;
					if(i+1<n){
						if(sSplit[i+1].equals(right)){
							i++;
						}else{
							break;
						}
					}else{
						break;
					}
				}
				if(leftCnt>rightCnt){
					tailCnt += leftCnt - rightCnt;
					leftCnt = 0;
					rightCnt = 0;
				}else if(leftCnt<rightCnt){
					topCnt += rightCnt - leftCnt;
					leftCnt = 0;
					rightCnt = 0;
				}else if(leftCnt==rightCnt){
					leftCnt = 0;
					rightCnt = 0;
				}
			}
		}

		if(leftCnt!=0){
			tailCnt += leftCnt;
		}

		if(topCnt>tailCnt){
			topCnt -= tailCnt;
			tailCnt = 0;
		}else if(topCnt<tailCnt){
			tailCnt -= topCnt;
			topCnt = 0;
		}


		for(int i=0; i<topCnt; i++){
			System.out.print(left);
		}
		for(int i=0; i<sSplit.length; i++){
			System.out.print(sSplit[i]);
		}
		for(int i=0; i<tailCnt; i++){
			System.out.print(right);
		}

	}

}
