

public class main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if (a>b){
			System.out.println("a>b");
		}
		else if (a<b) {
			System.out.println("a<b");
		} else {
			System.out.println("a=b");
		}
		
	}

}