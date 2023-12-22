import java.util.Scanner;
public class Main {
	void grading(){
		Scanner s = new Scanner(System.in);
		int m,f,r;
		m = s.nextInt();
		f = s.nextInt();
		r = s.nextInt();
		while(m != -1 || f != -1 || r != -1){
			if(m != -1 && f != -1){
				int tmp = m + f;
				if(tmp >= 80){
					System.out.println("A");
				}else if(tmp >= 65){
					System.out.println("B");
				}else if(tmp >= 50){
					System.out.println("C");
				}else if(tmp >= 30){
					if(r >= 50){
						System.out.println("C");
					}else{
						System.out.println("D");
					}
				}else{
					System.out.println("F");
				}
			}else{
				System.out.println("F");
			}
			m = s.nextInt();
			f = s.nextInt();
			r = s.nextInt();
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.grading();
	}
}