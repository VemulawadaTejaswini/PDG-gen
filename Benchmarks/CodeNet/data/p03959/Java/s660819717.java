import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    private static final int DIVVAL = 1000000007;

    public Main() {
    }

    public void exec(String args[]) throws Exception {
    	//初期化読み込み
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	sc.nextLine();
    	String sT = sc.nextLine();
    	String sA = sc.nextLine();
    	boolean wrong = false;
    	int[] T = parseStringInt(sT, ' ', N);
    	int[] A = parseStringInt(sA, ' ', N);
    	int[] ans = new int[N];
    	int preval=0;
    	for(int i=0; i<T.length; i++) {
    		if(preval < T[i]) {
    			ans[i] = 1;
    			preval=T[i];
    		}else{
    			ans[i] = T[i];
    		}
    	}
    	preval=0;
    	for(int i=A.length - 1; i>=0; i--) {
    		if(preval < A[i]) {
    			if(ans[i] == 1 && T[i] != A[i]) {
    				wrong = true;
    				break;
    			}
    			if(ans[i] != 1 && ans[i] < A[i]) {
    				wrong = true;
    				break;
    			}
    			ans[i] = 1;
    			preval=A[i];
    		}else{
    			if(ans[i] == 1 && T[i] > A[i]) {
    				wrong = true;
    				break;
    			}
    			if(ans[i] != 1 && ans[i] > A[i]) {
        			ans[i] = A[i];
    			}
    		}
    	}
    	long ansval = 1;
    	if(!wrong) {
    		for(int i=0; i<ans.length; i++) {
    			if(ans[i]==1) continue;
    			ansval = (ansval * ans[i]) % DIVVAL;
    		}
    	}else{
    		ansval=0;
    	}
    	System.out.println(ansval);
	}


    public int[] parseStringInt(String s, char delim, int size) {
    	int[] ia = new int[size];
    	char[] ca = s.toCharArray();
    	int intval= 0;
    	for(int ii=0, ci=0; ci<ca.length && ii<size; ci++){
    		if(ca[ci]==delim) {
    			ia[ii] = intval;
    			ii++;
    			intval=0;
    		}else if ('0' <= ca[ci] && ca[ci] <= '9'){
    			intval = intval*10 + (ca[ci] - '0');
    		}
    	}
    	ia[size-1]=intval;
    	return ia;
    }
}