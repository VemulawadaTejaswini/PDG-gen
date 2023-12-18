import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int max = 0;
	
	int N = scan.nextInt();
	String[] s = new String[N];

	for(int i = 0; i < N; i++){
	    s[i] = scan.next();
	}

	int M = scan.nextInt();
	String[] t = new String[M];

	for(int i = 0; i < M; i++){
	    t[i] = scan.next();
	}

	for(int i = 0; i < N; i++){
	    int count = 1;
	    for(int j = i + 1; j < N; j++){
		if(s[i].equals(s[j])){
		    count++;
		}
	    }
	    for(int k = 0; k < M; k++){
		if(s[i].equals(t[k])){
		    count--;
		}
	    }
	    if(count > max){
		max =count;
	    }
	}

	System.out.println(max);
    }
}
