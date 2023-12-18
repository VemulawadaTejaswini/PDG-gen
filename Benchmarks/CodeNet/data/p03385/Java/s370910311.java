import java.util.*;
public class Main {
		public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int k =sc.nextInt();
				int i = 0;
				int j = 0;
				if(a - b + 1 >= 2 * k - 1){
						for(;a + i <= b;i++){
						System.out.println(a + i);
						}
				}
				else{
						for(;j <= k-1;j++){
								System.out.println(a + j);
						}
						for(j = 0;j <= k-1;j++){
								System.out.println(b - k + 1 + j);
						}
				}
    }
}
