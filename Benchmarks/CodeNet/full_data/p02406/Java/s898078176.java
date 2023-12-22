import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			int x = i;
			if(x % 3 == 0){
				System.out.print(" " + i);
			}else{
				do{
                    if(x % 10 == 3){
                        System.out.printf(" %d",i);
                        break;
                    }
                    x /= 10;
                }while(x != 0);
			}
		}
		System.out.println();
	}
}
