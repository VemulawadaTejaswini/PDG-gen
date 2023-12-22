import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int z = sc.nextInt();
			if(z == 0)
				break;
			int z3 = z * z * z;
			int x=1,y=1;
			int max = 0;
			for(x = 1; (x * x * x) + (y * y * y) <= z3; x++){
				for(y = 1; (x * x * x) + (y * y * y) <= z3;y++){
					max = Math.max(max, (x * x * x) + (y * y * y));
				}
				y = 1;
			}
			System.out.println(z3 - max);
		}


	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}