import java.util.*;
import java.io.*;
import java.lang.*; 
public class Main {
	public static void main(String[] args)  throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long [] arr = new long[N];
		for(int i = 0 ; i < N ; i++){
		    arr[i] = sc.nextLong();
		}
		long [] an= new long[N];
// 		ArrayList<Long> list = new ArrayList<>();
        long pro = arr[0];
        an[0] = pro;
        int j = 1;
        for(int i = 1 ; i < K ; i++){
            pro = pro*arr[i];
            an[j] = pro;
            j++;
        }
        for(int i = K ; i < N ; i++){
            pro = (pro*arr[i])/an[i-K];
            an[j] = pro;
            j++;
        }
        for(int i = K ; i< N ; i++){
            if(an[i] > an[i-1]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
        
    }
}