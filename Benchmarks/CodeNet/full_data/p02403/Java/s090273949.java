import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = Integer.parseInt(scan.next());
		int w = Integer.parseInt(scan.next());		
		int i=0;
		int j=0;
		while(h!=0 && w!=0){
			for(i=0;i<h;i++){
				for(j=0;j<w;j++){
					System.out.print("#");
				}
				System.out.println("");
			}	
			h = Integer.parseInt(scan.next());
			w = Integer.parseInt(scan.next());	
		}
	}
}