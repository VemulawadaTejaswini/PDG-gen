public class Main{
	public static void main(String[] args){
		try{
			long N = Long.parseLong(args[0]);
			long sum = 0;
			if(N<1 || 1_000_000_000_000l < N){
				return;
			}
			
			for(long m = 1l;m<N;m++){
				if(N/m == N%m){
					sum += m;
				}
			}
			
			System.out.println(sum);
		} catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}