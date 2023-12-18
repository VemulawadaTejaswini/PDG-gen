import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int[] d = new int[N];

	for(int i=0; i<N; i++){

	d[i] = sc.nextInt();
  }

	int ans = 0;

	for(int i=1; i<N; i++){

	for(int j=0; j<i; j++){

	ans += d[i]*d[j];

  }

  }
	  
	System.out.println(ans);

 }
}