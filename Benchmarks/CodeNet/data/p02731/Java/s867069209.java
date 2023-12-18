import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 	int l = sc.nextInt();

			if (l%3==0) {
				System.out.println(((l/3)*(l/3)*(l/3)));
			}else if(l%3==1){
				System.out.println(((l/3)*(l/3)*((l/3)+1)));
			}else{
				System.out.println(((l/3)*((l/3)+1)*((l/3)+1)));
			}
	}
}
