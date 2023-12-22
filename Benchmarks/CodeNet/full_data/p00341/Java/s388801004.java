import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] e=new int [12];
        for(int i=0; i<12; i++) {
        	e[i]= sc.nextInt();
        }
        Arrays.sort(e);
        if(e[0]==e[1] && e[0]==e[2] && e[0]==e[3] && e[4]==e[5] && e[4]==e[6] && e[4]==e[7] && e[8]==e[9] && e[8]==e[10] && e[8]==e[11])
        	System.out.println("yes");
        else
        	System.out.println("no");
	}
}
