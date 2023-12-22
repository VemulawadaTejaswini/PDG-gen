import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h,w,i,a,b,c,d;

		for(i=0;i<=1;){
			System.out.print("入力＞");
			h = sc.nextInt();
			System.out.print("入力＞");
			w = sc.nextInt();
			if(h<=0){
				if(w<=0){
					i =2;
				}
			}
			for(a=0;a<h;a++){
				for(b=0;b<w;b++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		sc.close();
	}

}
