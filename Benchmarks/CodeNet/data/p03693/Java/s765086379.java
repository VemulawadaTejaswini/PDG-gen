public class A {
	public static int main(String[] args) {
		int number = Integer.parseInt(args[0])*100 + Integer.parseInt(args[1])*10 + Integer.parseInt(args[2]);
		
		if((number % 4) == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("NO");
		}
		return 0;
	}
}