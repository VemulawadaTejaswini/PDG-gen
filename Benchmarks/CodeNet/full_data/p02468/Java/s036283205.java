import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	int reg =1;
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
    	int n = sc.nextInt();
    	for(int i=0;i<n;i++){
    		reg*=m;
    	}
    	reg=reg%1000000007;
    	System.out.println(reg);
    }
}

