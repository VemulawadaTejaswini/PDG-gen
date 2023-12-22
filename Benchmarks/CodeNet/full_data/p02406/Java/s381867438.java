import java.util.Scanner;

class Structure{
	int n, x, i;
	public void execute(int k){
		n = k;
		i = 1;
		check_num();
		System.out.println("");
	}
	
	public void check_num(){
		//System.out.println("check_num");
		x = i;
		if (x % 3 == 0 ){
		    System.out.printf(" %d", i);
		    end_check_num();
		}
		include3();
	}
	
	public void include3(){
		//System.out.println("include3");
		if (x % 10 == 3){
			System.out.printf(" %d", i);
			 end_check_num();
		}
		x /= 10;
		if (x == 1) include3();
		end_check_num();
	}
	
	public void end_check_num(){
		//System.out.println("end_check_num");
		if (++i <= n) check_num();
	}
}

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Structure st = new Structure();
		st.execute(n);
	}
}