public class Main {
	Scanner sc = new Scanner(System.in);
	int rep(int n){
		if(n == 0){
			return 1;
		}else{
			return rep(n-1)*n;
		}
	}
	void run(){
		int n = sc.nextInt();
		System.out.println(rep(n));
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}