import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
		String str = sc.nextLine();
		char[] c = str.toCharArray();
int x=0;
		for(int i=0;i<=a-1;i++){
if(c[i]=='R'){
x++;
}


		}

	if(x>=a/2){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
	}
}