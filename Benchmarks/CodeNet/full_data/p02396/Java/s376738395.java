import java.util.Scaner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		for(int i = 0; ; i++){
			int a = scan.nextInt();
			if(a == 0) break;
			System.out.printf("Case %d: %d\n", i, a);
		}
	}
}