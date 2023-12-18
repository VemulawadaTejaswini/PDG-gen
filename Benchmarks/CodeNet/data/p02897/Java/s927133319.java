public class OddsProbability {
	public static void main(String[] args) {
      double N = Double.parseDoubel(args[0]);
      if (N % 2 == 0){
      	System.out.println(N/2*N);
      }
      else{
        System.out.println((N+1) / 2*N);
      }
	}
}