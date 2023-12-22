import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[8];
        while(scan.hasNext()){
        	int n = scan.nextInt();
        	if(n == 0){
        		break;
        	}
        	for(int i = 0;i < n;i++){
        		for(int j = 0;j < 8;j++){
        			a[j] = scan.nextInt();
        		}
        		int x = a[0]*a[4] - a[1]*a[5] - a[2]*a[6] - a[3]*a[7];
        		int y = a[0]*a[5] + a[1]*a[4] + a[2]*a[7] - a[3]*a[6];
        		int z = a[0]*a[6] - a[1]*a[7] + a[2]*a[4] + a[3]*a[5];
        		int w = a[0]*a[7] + a[1]*a[6] - a[2]*a[5] + a[3]*a[4];
        		System.out.println(x + " " + y + " " + z + " " + w);
        	}
        }
    }
}