import java.util.*;

public class Main {

  public static void main(String args[]) {
    int rep = 1;
    if( args.length > 0 ) { rep = Integer.parseInt(args[0]); }
    (new Main()).__solve(rep);
  }

  void __solve(int rep) {

    try (
      Scanner cin = new Scanner(System.in);
    ) {

      for( int i = 0; i < rep; ++i ) {
        __solve(cin);
      }

    }

  }

  void __solve(Scanner cin) {
	  
	  int N = cin.nextInt();
	  int K = cin.nextInt();
	  
	  int arr[] = new int[N];
	  for( int i = 0; i < N; ++i ) {
		  arr[i] = cin.nextInt();
	  }
	  Arrays.sort(arr);
	  int val[][] = new int[K][2];
	  for( int i = 0; i < K; ++i ) {
		  val[i][0] = cin.nextInt();
		  val[i][1] = cin.nextInt();
	  }
	  Arrays.sort(val, new Comparator<int[]>() {
		  public int compare(int a[], int b[]) {
			  if( a[1] > b[1] ) { return -1; }
			  if( a[1] < b[1] ) { return 1; }
			  return 0;
		  }
	  });

	  long sumRest[] = new long[N + 1];
	  for( int i = N - 1; i >= 0; --i ) {
		  sumRest[i] = sumRest[i + 1] + arr[i];
	  }
	  
	  long max = sumRest[0];
	  int L = 0;
	  long sum = 0;
	  for( int i = 0; i < K; ++i ) {
		  for( int j = 0; j < val[i][0]; ++j ) {
			  if( L == N ) { break; }
			  ++L;
			  sum += val[i][1];
			  max = Math.max(max, sum + sumRest[L]);
		  }
	  }

	  System.out.println(max);

  }

}
