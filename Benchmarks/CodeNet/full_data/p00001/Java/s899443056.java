import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	int [] in = new int[10];

        //input
        Scanner sc = new Scanner(System.in); //.useDelimiter(System.getProperty("line.separator"));

        for(int i=0;i<10;i++){
        	in[i]= sc.nextInt();
        }

        //calculation
        Arrays.sort(in);

        //output
        for(int i=9;i>6;i--){
        	System.out.println(in[i]);
        }
    }
}