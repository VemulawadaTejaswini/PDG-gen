import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		char[] ipt = input.toCharArray();
		char[]one = {'S' , 'S' , 'W' , 'W'};
		char[]two = {'S' , 'W' , 'S' , 'W'};
		char[]ans = new char[N+1];
		for(int i = 0 ; i<4; i++) {
			ans[0] = one[i];
			ans[1] = two[i];
			ans = getAnswer(ans, ipt);
			if(ans[ans.length-1] == ans[0]) {
				if(ans[0] == 'S') {
					if(ipt[0] == 'o') {
						if(ans[1]!=ans[ans.length-2])continue;
					}
					else {
						if(ans[1]==ans[ans.length-2])continue;
					}
				}
				else {
					if(ipt[0] == 'o') {
						if(ans[1] == ans[ans.length-2])continue;
					}
					else {
						if(ans[1] != ans[ans.length-2])continue;
					}
				}
				for(int j = 0 ; j<ans.length-1; j++) {
					System.out.print(ans[j]);
				//	if((j-1)%211 == 0)System.out.println();
				}
				System.out.println();
			//	System.out.println(ans[0]+""+ans[1]);
				return;
			}
		}
		System.out.println(-1);
	}
	
	static char[] getAnswer(char[] ans, char[] ipt) {
		for(int i = 1; i<ipt.length; i++) {
			if(ipt[i] == 'o') {
				if(ans[i] == 'S') {
					if(ans[i-1] == 'S') {
						ans[i+1]='S';
					}
					else {
						ans[i+1]='W';
					}
				}
				else {
					if(ans[i-1] == 'S') {
						ans[i+1]='W';
					}
					else {
						ans[i+1]='S';
					}
				}
			}
			else {
				if(ans[i] == 'S') {
					if(ans[i-1] == 'S') {
						ans[i+1]='W';
					}
					else {
						ans[i+1]='S';
					}
				}
				else {
					if(ans[i-1] =='S') {
						ans[i+1]='S';
					}
					else {
						ans[i+1]='W';
					}
				}
			}
		}
		return ans;
	}
}
