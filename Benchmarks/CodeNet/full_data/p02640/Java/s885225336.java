import java.util.*; 

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int a =  x * 2;
		
		for(int i=0;i<x;i++){
			if(a==y){
				System.out.println("Yes");
				return;
			}
			a = a + 2;
		}
		System.out.println("No");
		}
	  }