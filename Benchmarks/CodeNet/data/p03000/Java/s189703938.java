import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int range = scan.nextInt();
        int dif = 0, count = 0, sum = 0;
        
	while((sum <= range) && (count < max)){
	    count++;
	    dif = scan.nextInt();
	    sum += dif;
	}
	if(sum <= range){
	    count++;
	}
	System.out.print(count);
    }
}
