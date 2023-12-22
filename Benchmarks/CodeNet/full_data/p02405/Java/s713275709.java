
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		for(;;){
			int h=sc.nextInt();
			int w=sc.nextInt();
			if(h==0&&w==0) break;
			for(int i=0;i<h;i++){
				if(i%2==0){
					for(int j=0;j<w;j++){
						if(j%2==0) System.out.print("#");
						else System.out.print(".");
					}
					System.out.println();
				}
				else{
					for(int j=0;j<w;j++){
						if(j%2!=0) System.out.print("#");
						else System.out.print(".");
					}
					System.out.println();
				}
			}
		}
		
	}

}