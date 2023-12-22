import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			int m,f,r;
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			
			while(m!=-1 || f!=-1 || r!=-1){
				int x=m+f;
				if(m==-1 || f==-1 || x<30){
					System.out.println("F");
				}else if(x>=30 && x<50){
					if(r>=50){
						System.out.println("C");
					}else{
					System.out.println("D");
					}
				}else if(x>=50 && x<65){
					System.out.println("C");
				}else if(x>=65 && x<80){
					System.out.println("B");
				}else if(x>=80){
					System.out.println("A");
				}
				m = sc.nextInt();
				f = sc.nextInt();
				r = sc.nextInt();
			}
	}

}