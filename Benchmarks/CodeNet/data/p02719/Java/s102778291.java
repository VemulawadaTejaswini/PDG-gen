import java.util.*;

public class Main {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int N = sc.nextInt();
int K = sc.nextInt();
for(int i=0;i<((N/K)+1);i++){
	if(N>=(N-K)){
		N=N-K;
		if(N<=0){
			N=N*-1;
		}
	}
}
System.out.println(N);
}
}

