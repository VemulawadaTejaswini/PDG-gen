import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();		//1が書かれたカード
		int b=sc.nextInt();		//0が書かれたカード
		int c=sc.nextInt();		//-1が書かれたカード
		int k=sc.nextInt();		//k枚選ぶ
		
		if(k<=a){
        	System.out.println(k);
        }else if(k<=a+b){
        	System.out.println(a);
        }else{
        	System.out.println(2*a-k+b);
        }
	}

}
