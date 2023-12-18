import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        int j;
        String jadge;
        int nlength =String.valueOf(n).lenght();
        for(int i; i > nlength; i++){
            sum = (n / Math.pow(10,i)/10) + sum
        }
        j = n / sum;
        if(j == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
		
	}
}