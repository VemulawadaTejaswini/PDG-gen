import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int K = sc.nextInt();

    	int sum = 0;

    	for(int i=1;i<=K;i++) {
    		for(int j=1;j<=K;j++) {
    			for(int k=1;k<=K;k++) {
    				sum += gcd(i,gcd(j,k));
    			}
    		}
    	}
    	System.out.println(sum);

    }

    public static int gcd(int num1,int num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }

}
