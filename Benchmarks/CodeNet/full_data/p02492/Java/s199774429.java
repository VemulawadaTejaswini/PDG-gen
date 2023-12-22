import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int i=1,j, k=0;
		int p[] = new int[100];
		while(i == 1){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
			switch(op){
			case "+":
				p[k] = a + b;
				k++;
				break;
			case "-":
				p[k] = a - b;
				k++;
				break;
			case "*":
				p[k] = a * b;
				k++;
				break;
			case "/":
				p[k] = a / b;
				k++;
				break;
			case "?":
				i = -1;
				break;
			}
		}
	
	for(j=0; j<=k-1;j++){
		System.out.printf("%d\n", p[j]);
	}
	}
}