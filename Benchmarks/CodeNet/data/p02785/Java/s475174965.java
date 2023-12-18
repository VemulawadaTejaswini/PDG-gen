import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
      
        int N = sc.nextInt();   //the number of monster
        int A = sc.nextInt();   //the number of limit of deathblow
        int count  = 0;
        int[] H = new int[N];   //the HP of monster
        for(int i = 0;i < N;i++){
          H[i] = sc.nextInt();
        }
        Arrays.sort(H);
        if(A > 0){
        	for(int i = A - 1;i < N;i++){
        	count += H[i];
        	}
        }else{
        	for(int i = 0;i < N;i++){
        	count += H[i];
        	}
        }
        count += A;
        System.out.println(count);
    }
}