import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int X = sc.nextInt();

	int Aa = 0;
	int Ba = 0;
	while(true){
	    for(int A=-9;A<10;A++){
		for(int B=-9;B<10;B++){
		    if(Math.pow(A,5) - Math.pow(B,5) == X){
			Aa = A;
			Ba = B;
			break;
		    }
		}
	    }
	    break;
	}
	System.out.print(Aa+" "+Ba);
    }
}
