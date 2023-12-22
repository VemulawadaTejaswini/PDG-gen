import java.util.Scanner;

public static void main(String[] args) {
		int i,x,y;
		Scanner sc = new Scanner(System.in);
		for(i=1;;i++){
		    x = sc.nextInt()
		    if(x == 0){
		        sc.close();
		        return;
		    }
		    System.out.println("case "+i+": "+x);
		}
	}
