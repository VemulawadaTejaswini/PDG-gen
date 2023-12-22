public class Main {
	public static void main(String[]args){
		System.out.println(Cube(2));
		System.out.println(Cube(8));
		System.out.println(Cube(3));
		System.out.println(Cube(27));
	}

	public static int Cube(int x){
		int ans = 1;
		for(int i = 0; i < 3; i++){
			ans *= x;
		}
		return ans;
	}
}