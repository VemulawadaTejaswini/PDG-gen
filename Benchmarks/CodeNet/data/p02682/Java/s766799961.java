class Main {
	public static void main(String[] args) {
      	java.util.Scanner in = new java.util.Scanner(System.in);
      long A = in.nextLong();
       long B = in.nextLong();
       long C = in.nextLong();
       long K= in.nextLong();
    	 new Main().solve(A, B, C, K);
    }
  	private void solve(long a,long b,long c,long k) {
      long ans = Math.max(a, k-a);
      if(ans <= b) {
        System.out.print(ans);
      } else {
        long sum = ans;
        ans -= b;
        sum -= ans;
        System.out.print(sum);
      }
    }
}