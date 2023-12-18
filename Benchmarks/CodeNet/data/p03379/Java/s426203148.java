import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

	int N= sc.nextInt();
	
	int X[]=new int[N];
    int Y[]=new int[N-1];
	for(int i=0;i<N;i++){
		X[i]=sc.nextInt();
	}
    
    for(int i=0;i<N;i++){
        int cnt=0;
        for(int j=0;j<N;j++){
            if(i!=j){
            Y[cnt]=X[j]; 
            cnt=cnt+1;
            }
        }
        Arrays.sort(Y);
        System.out.println(Y[(N-1)/2]);
        
    }
    
    }

}
