import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int[]max = new int[7];
        int[]min = new int[7];
		
		int high,low,sa;
        
        for(int i=0;i<7;i++){
			high=sc.nextInt();
            max[i] = high;
			
			low=sc.nextInt();
            min[i] = low;
        }
		System.out.println();
		
        for(int j=0;j<7;j++){
            sa = max[j]-min[j];
            System.out.println(sa);
        }
    }
}