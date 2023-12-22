import java.util.*;
class Main{
    public static void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	ArrayList<Integer> X = new ArrayList<Integer>();
	for(int i = 0; i < N; i++){
	    X.add(sc.nextInt());
	}
	int M = sc.nextInt();
	for(int j = 0; j < M; j++){
	    int m = sc.nextInt()-1;
	    int num = X.get(m);
	    if(X.contains(num+1) || num+1 == 2020){}
	    else{
		X.set(m,num+1);
	    }
	}
	for(int i = 0; i < N;i++){
	    System.out.println(X.get(i));
	}
    }
}
