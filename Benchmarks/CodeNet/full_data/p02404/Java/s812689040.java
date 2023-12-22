import java.util.Scanner;
public class Main02 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int h,w,i,a,b;

	for(i=0;i<=1;){
		h = sc.nextInt(); w = sc.nextInt();
		if(h<=0){
			if(w<=0){
				i =2;
			}
		}
			for(b=0;b<w;b++){
				System.out.print("#");
			}System.out.println("");
			for(a=2;a<h;a++){
				for(b=0;b<w;b++){
					System.out.print("#");
					for(b=2;b<w;b++){
						System.out.print(".");
					}
					System.out.print("#");
					System.out.println("");
			}
			}
			for(b=0;b<w;b++){
				System.out.print("#");
			}
			System.out.println("");
			System.out.println("");
			if(i!=0)
				break;
			
		}
		System.out.println("");
		sc.close();
	}
}
