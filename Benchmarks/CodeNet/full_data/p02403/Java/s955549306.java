import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		while(true){
			int h=sc.nextInt();
			int w=sc.nextInt();
			if(h==0 && w==0) break;
			StringBuilder shp=new StringBuilder();
			
			for (int i=0;i<h;i++){
				for (int j=0;j<w;j++){
					shp.append("#");
				}
				shp.append("\n");
			}//for 
			System.out.println(shp);
		}//while
	}
}