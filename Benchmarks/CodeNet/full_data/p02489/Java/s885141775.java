import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x,i=1;
		while(true){
			x=sc.nextInt();
			if(x==0){
				break;
			}
			System.out.println("Case "+i+":"+" "+x);
			i++;
		}
	}

}