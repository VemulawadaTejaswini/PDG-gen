public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int y = 0;
		int i = 0;
		for(i = 0;i<=L;i++){
				A = A - C;
				B = B - D;
				y++;
				if(A<=0&&B<=0){
					L = L - y;
					System.out.println(L);
					break;
				}
		}
	}
}