import java.util.*;

public class mon2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		for(int i=1;i<=4;i++){
			 x = scan.nextInt();
			 z = scan.nextInt();
			 if(x == 1){
			 	y = z * 6000;
			 }else
			 if(x == 2){
			 	y = z * 4000;
			 }else
			 if(x == 3){
			 	y = z * 3000;
			 }else
			 if(x == 4){
			 	y = z * 2000;
			 }
			 System.out.println(y);
		}
	}
}