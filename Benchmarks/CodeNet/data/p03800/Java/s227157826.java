import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input = sc.next();
		String[] way = {"SS" , "SW" , "WS" , "WW" };
		char[]one = {'S' , 'S' , 'W' , 'W'};
		char[]two = {'S' , 'W' , 'S' , 'W'};
		char[]ans = new char[N+1];
		//String res ="";
		for(int i = 0 ; i<4; i++) {
			ans[0] = one[i];
			ans[1] = two[i];
		//	res = way[i];
		//	res = getAnswer(ans, input);
			ans = getAnswer(ans, input);
		//	boolean OK = judge(ans,input);
			if(ans[ans.length-1] == ans[0]) {
				String res = "";
				for(int j = 0 ; j<ans.length-1; j++) {
					res+=ans[j];
				}
				System.out.println(res);
				return;
			}
		}
		System.out.println(-1);
	}
	
	static char[] getAnswer(char[] ans, String input) {
		for(int i = 1; i<input.length(); i++) {
			if(input.charAt(i) == 'o') {
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
	
	
	
/*	static boolean judge(char[] ans, String input) {
		if(input.charAt(input.length()-1) == 'o') {
			if(ans[ans.length-1] == 'S') {
				if(ans[ans.length-2] == 'S') {
					if(ans[0] == 'S') {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					if(ans[0] == 'W') {
						return true;
					}
					else {
						return false;
					}
				}
			}
			else {
				if(ans[ans.length-2] == 'S') {
					if(ans[0] == 'S') {
						return false;
					}
					else {
						return true;
					}
				}
				else {
					if(ans[0] == 'W') {
						return false;
					}
					else {
						return true;
					}
				}
			}
		}
		else {
			if(ans[ans.length-1] == 'S') {
				if(ans[ans.length-2] == 'S') {
					if(ans[0] == 'S') {
						return false;
					}
					else {
						return true;
					}
				}
				else {
					if(ans[0] == 'W') {
						return false;
					}
					else {
						return true;
					}
				}
			}
			else {
				if(ans[ans.length-2] == 'S') {
					if(ans[0] == 'S') {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					if(ans[0] == 'W') {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
	}*/
}
