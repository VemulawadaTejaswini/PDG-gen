public class Main{
	public static void main(String[] args){
		try{
			int R = Integer.parseInt(args[0]);
			int G = Integer.parseInt(args[1]);
			int B = Integer.parseInt(args[2]);
			int N = Integer.parseInt(args[3]);
			int combinations = 0;
			
			if(R<1 || 3000<R){
				return;
			}
			if(G<1 || 3000<G){
				return;
			}
			if(B<1 || 3000<B){
				return;
			}
			if(N<1 || 3000<N){
				return;
			}
			
			for(int r = 0;r*R <= N; r++){
				for(int g = 0; r*R + g*G <= N; g++){
					for(int b = 0; r*R + g*G + b*B <= N; b++){
						if(r*R + g*G + b*B == N){
							combinations++;
						}
					}
				}
			}
			
			System.out.println(combinations);
		} catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}