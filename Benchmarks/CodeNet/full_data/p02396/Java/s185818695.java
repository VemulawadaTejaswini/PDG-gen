import java.util.Scanner;
public class Aizu {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x,i=1;
		while(true){
			x=sc.nextInt();
			if(x==0)break;
			System.out.println("Case "+ i +": "+ x);
			i++;
		}
	}
}

