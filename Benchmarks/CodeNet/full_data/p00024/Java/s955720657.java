import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double v = sc.nextDouble();
			for(int i=1; ; i++)
				if(98*(i-1) >= v*v){
					System.out.println(i);
					break;
					}
			}

	}

}