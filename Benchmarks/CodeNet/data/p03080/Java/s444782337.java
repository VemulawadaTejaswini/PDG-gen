import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		int Rcount = 0;
		int Bcount = 0;

		for (int i = 0; i < N; i++) {
			String str2 = String.valueOf(str.charAt(i));
			if(str2.equals("R")){
				Rcount++;
            }else{
				Bcount++;
            }
		}
		if(Rcount>Bcount){
			System.out.println("Yes");
        }else{
			System.out.println("No");
        }
	}
}
