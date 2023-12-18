import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 入力値
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();
		//char[] abc = {'A','B','C'};
		int cnt = 0;
		//int abccnt = 0;
		for(int i=0;i<n-3;i++){
			if(s[i]=='A' && s[i+1]=='B' && s[i+2]=='C') cnt++;
			/*
			if(s[i]==abc[abccnt]){
				abccnt++;
			}else{
				abccnt=0;
			}
			if(abccnt==3){
				abccnt=0;
				cnt++;
			}
			*/
		}
		System.out.println(cnt);
    }
}