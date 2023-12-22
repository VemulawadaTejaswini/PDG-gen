public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int Japa , Math;
		
		if(A % C == 0){
			Japa = A / C;
		}else{
			Japa = A / C + 1;
		}
		
		if(B % D == 0){
			Math = B / D;
		}else{
			Math = B / D + 1;
		}
		
		int Bigone = Japa;
		
		if(Japa < Math){
			Bigone = Math;
		}
		
		System.out.println(L - Bigone);
		
	}
	
}