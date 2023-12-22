import java.io.*;
import java.util.*;

class Main{
    int sum = 0;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
	
	//荷物の数
        int n = sc.nextInt();
	//トラックの数
        int k = sc.nextInt();
	//トラックに現在積んである荷物の重さ
        int[] truck = new int[k];
	//荷物の重さ
        int[] weight = new int[n];
	
	
	for(int i = 0;i < n;i++){
	    weight[i] =  sc.nextInt();
	}
	System.out.println(dicision(n,k,weight,truck));
    }
    public static int dicision(int n,int k,int[] weight,int[] truck){
	int P;
	int left = 0;
	int right = n * 10000;
	int mid;
	while(right - left > 1){
	    mid = (left + right) / 2;
	    int v = check(n,k,weight,truck,mid);
	    if(v >= n) right = mid;
	    else left = mid;
	    Arrays.fill(truck,0);
	}
	
	return right;
    }
    public static int check(int n,int k,int[] weight,int[] truck,int P){
	//トラックの総積載量がPを超えてはならない
	int j = 0;

	for(int i = 0;i < k;i++){
	    
	    while((weight[j] + truck[i]) <= P){
		
		truck[i] += weight[j];
		// System.out.println(truck[i]);
		++j;
		//System.out.println(j);
		
		//全て積むことができた場合nを返す
		if(j == n) {
		    return n;
		}
     	    }
	}
	return 0;
    }

}




