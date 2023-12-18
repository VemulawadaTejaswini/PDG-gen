import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]W = new int[N];
 
    int all = 0;
    double half = 0;
    int mae = 0;
    int usiro = 0;
     for(int i=0; i<N; i++){
        W[i] = sc.nextInt();
        	all += W[i];
        	half = all/2;
    }
    for(int i=0; i<N; i++){
    	if(mae < half){
    	mae += W[i];
    }
    }   
    	usiro = all-mae;
    System.out.println(Math.abs(mae - usiro));
    }
}
