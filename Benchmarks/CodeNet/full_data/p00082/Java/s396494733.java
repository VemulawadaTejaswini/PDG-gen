import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = {1,2,1,2,1,4,1,4};
        while(scan.hasNext()){
        	int[] p = new int[8];
        	for(int i = 0;i < 8;i++){
        		p[i] = scan.nextInt();
        	}
        	int tI = 0;
        	int s = 0;
        	for(int i = 2;i < 16;i+=2){
        		int ts = 0;
        		for(int j = 0;j < 8;j++){
        			int t = p[j] - a[(j+i)%8];
        			ts += (t < 0)?0:t;
        		}
        		if(s > ts || s == 0){
        			s = ts;
        			tI = i;
        		}
        		if(i == 6){
        			i += 1;
        		}
        	}
        	for(int i = 0;i < 8;i++){
        		System.out.print(a[(i+tI)%8] + ((i == 7)?"\n":" "));
        	}
        }
    }
}