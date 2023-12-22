import java.util.Scanner;

public class PrintRectangle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j;
		for(;;){
		int h=sc.nextInt();
		int w=sc.nextInt();
		if(h==0&&w==0){
			break;
		}
		for(i=0;i<h;i++){
			for(j=0;j<w;j++){
				System.out.print('#');
			}
			System.out.printf("\n");
		}
		
		}
	}
}