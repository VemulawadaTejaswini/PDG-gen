import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int min = a;
		int len = b;
		if(a>b){
			min = b;
			len = a;
		}
		String s = "";
		for(int i=0;i<len;i++){
			s = s + min;
		}
		System.out.println(s);
	}
}