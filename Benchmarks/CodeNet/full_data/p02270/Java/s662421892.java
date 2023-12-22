import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int lag[] = new int[N];
        int sum = 0;
        int ave = 0;
        for(int i = 0; i < N; i++){
        	lag[i] = scanner.nextInt();
           	sum += lag[i];
        }
        scanner.close();
        ave = sum / K;
        for (int j = ave;;j++) {
            if(isPossible(K ,j,lag)){
            	System.out.println(j);
            	break;
            }
        }
    }
    //x の車両に y　kgずつz の荷物を詰めるかどうか
    static boolean isPossible(int x,int y, int[] z){
    	int sum=0;
    	int carIndex=0;
    	for(int a=0; a < z.length;a++) {
    		if(sum +z[a] <= y){
    			sum +=z[a];

    		} else {
    			carIndex++;
    			if((z[a] > y) || (carIndex == x)){
    				return false;
    			}
    			sum=z[a];
    		}
    	}
    	return true;
    }
}
