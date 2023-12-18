import java.util.Scanner;

public class Main {
	static int solve(char A[] , char B[]){
		int ret = A.length + B.length;
		for(int i = 0 ; i < A.length ; ++i){
			boolean match = true;
			for(int j = 0 ; j < B.length ; ++j){
				if(i + j >= A.length){
					break;
				}
				if(A[i + j] == B[j]){
					continue;
				}
				if(A[i + j] == '?' || B[j] == '?'){
					continue;
				}
				match = false;
				break;
			}
			if(match){
				int L = i + B.length  < A.length ? A.length : i + B.length;
				ret = Math.min(ret, L);
			}
		}
		return ret;
	}
	static int solve(String a , String b , String c){
		char A[] = a.toCharArray();
		char B[] = b.toCharArray();
		char C[] = c.toCharArray();
		int ret = A.length + B.length + C.length;
		for(int i = 0 ; i < a.length() ; ++i){
			boolean match = true;
			for(int j = 0 ; j < B.length ; ++j){
				if(i + j >= A.length){
					break;
				}
				if(A[i + j] == B[j]){
					continue;
				}
				if(A[i + j] == '?' || B[j] == '?'){
					continue;
				}
				match = false;
				break;
			}
			if(!match){
				continue;
			}
			int L = i + B.length  < A.length ? A.length : i + B.length;
			char AB[] = new char[L];
			for(int j = 0 ; j < i ; ++j){
				AB[j] = A[j];
			}
			int bidx = 0;
			for(int j = i ; j < L ; ++j){
				if(j >= A.length){
					AB[j] = B[bidx++];
				}else if(bidx >= B.length){
					AB[j] = A[j];
				}else{
					if(A[j] == B[bidx]){
						AB[j] = A[j];
					}else{
						if(A[j] == '?'){
							AB[j] = B[bidx];
						}else{
							AB[j] = A[j];
						}
					}
					++bidx;
				}
			}
			ret = Math.min(ret, solve(AB , C));
		}
		char AB[] = new char[A.length + B.length];
		for(int i = 0 ; i < A.length ; ++i){
			AB[i] = A[i];
		}
		for(int i = 0 ; i < B.length ; ++i){
			AB[i + A.length] = B[i];
		}
		ret = Math.min(ret, solve(AB , C));
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		int ret = solve(a , b ,c);
		ret = Math.min(ret, solve(a , c, b));
		ret = Math.min(ret, solve(b , a, c));
		ret = Math.min(ret, solve(b , c, a));
		ret = Math.min(ret, solve(c,  a ,b));
		ret = Math.min(ret, solve(c , b, a));
		System.out.println(ret);
	}
}
