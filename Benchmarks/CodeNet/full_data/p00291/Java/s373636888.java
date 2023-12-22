import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r[] ={1,5,10,50,100,500};
		int t=0;
		for(int i=0;i<6;i++){
			t+=sc.nextInt()*r[i];
		}
		if(1000<=t){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}
}