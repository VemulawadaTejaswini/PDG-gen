import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int S[] = new int[n];
	for(int i = 0;i < n;i++) S[i] = sc.nextInt();
	int q = sc.nextInt();
	int T[] = new int[q];	
	for(int i = 0;i < q;i++) T[i] = sc.nextInt();
	int cnt = 0;
	for(int j = 0;j < q;j++){
	    for(int i = 0;i < n;i++){
		if(i > 0){
		    int flag = 0;
		    for(int k = 0;k < i;k++){
			if(S[k] == S[i]) flag = 1;
		    }
		    if((flag == 0) && (S[i] == T[j])){
			cnt++;
		    }
		}
		else if(S[i] == T[j]) cnt++;
	
	    }
	}
	System.out.println(cnt);
    }
}

