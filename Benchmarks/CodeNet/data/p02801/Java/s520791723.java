import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int N = sc.nextInt();//科目数
    int K = sc.nextInt();//満点
    int M = sc.nextInt();//目標の平均点
    int A[] = new int[N-1];   
    int sum = 0;
    int ave = 0;
    int gap = 0;
        
    for(int i=0;i<(N-1);i++){
    		A[i] = sc.nextInt();//i番目のテストの点数
        	sum += A[i];
        
    }
    //System.out.println(sum);
    //ave = sum/(K-1);
    //gap = M-ave;
    gap = M*N-sum;
    if(gap<0) {
        System.out.println(0);
        System.exit(0);
    }
    //System.out.println(ave);
    //System.out.println(gap); 
	if(gap>=0&&gap<=K){
    	System.out.println(gap);
    }else System.out.println(-1);
    }
}