import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int K=stdIn.nextInt();
		int z=1,y=0;
		while(z<=A&&z<=B){
			if(A%z==0&&B%z==0)
				y++;
			if(y==K){
				System.out.println(z);
				break;
			}
			z++;
		}
	}

}