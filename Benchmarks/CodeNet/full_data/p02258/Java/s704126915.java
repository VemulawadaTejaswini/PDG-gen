import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int R[] = new int[n];
        for(int i = 0; i < n; i++){
            R[i] = sc.nextInt();
        }
        
    	int saidai = R[1] - R[0];
    	int saisyo = R[0];
        for(int i = 1; i < n; i++){
        	if(saidai < R[i]-saisyo){
        		saidai = R[i] - saisyo;
        	}
        	if(saisyo > R[i]){
        		saisyo = R[i];
        	}
        }
        System.out.println(saidai);
    }
}
