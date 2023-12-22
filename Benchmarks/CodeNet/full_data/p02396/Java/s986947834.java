import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
		int i,x;
		Scanner sc = new Scanner(System.in);
		for(i=1;;i++){
			x=sc.nextInt();
			if(x == 0){
				break;
			}
			System.out.println("case "+i+" : "+x);
		}
		sc.close();
		return;
	}

}
