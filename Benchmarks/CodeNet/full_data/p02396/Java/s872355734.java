import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =10000;
		
		for(int i=1;i<n;i++){
			int x = sc.nextInt();
			if(x ==  0)
				break;
			System.out.println("case"+ i + ":"+ x);
		}
	}
	}

