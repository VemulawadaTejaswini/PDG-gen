import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int [] F = new int[45];
		F[0] =1;
		F[1] = 1;
		for(i=2;i<45;i++){
			F[i] = F[i-1]+F[i-2];
		}
       System.out.println(F[sc.nextInt()]);
		
		
	}

}

