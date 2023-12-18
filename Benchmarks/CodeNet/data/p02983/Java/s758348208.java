public class Main {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int D = input.nextInt();
		int mod = 2019;
		for(int i = N+1; i <= D; i++ ){
			int currentMod = (N*i)%2019;
			if(currentMod < mod ){
				mod = currentMod;
			}
		}
		System.out.println(mod);
	}
}
