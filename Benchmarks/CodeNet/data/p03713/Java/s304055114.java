import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H % 3 == 0 || W % 3 == 0){
				System.out.println(0);
			}else{
				int result = 0;
				if(H % 2 != 0 && W % 2 != 0){
					result = H/2 + W/2;
				}else{
					result = (H > W)? W/2 : H/2;
				}
				System.out.println(result);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
}