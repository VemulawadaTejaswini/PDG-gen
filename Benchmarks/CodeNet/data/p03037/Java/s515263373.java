import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数型を宣言して読み込む
		int N = sc.nextInt();
		int M = sc.nextInt();		
		//整数型配列の宣言と初期化	
		int ans=0;
		int [] ansary;
		ansary = new int [N];
		for(int i=0;i<N;i++){
		ansary[i]=1;	
		}
		int [] arrays;
		arrays = new int [2*M];
		for(int i=0; i<2*M;i++){		
		arrays[i]=sc.nextInt();		
		}
		for(int j=0; j<N;j++){		
			for(int k=0; k<2*M;k+=2){			
				if(arrays[k]<=j&&j<=arrays[k+1]){	
				}else{		
				ansary[j]=2;	
					}
				break;
			}
		}		
		for(int l=0; l<N;l++){
			if(ansary[l]==1){
			ans = ans+1;
			}	
		}
		System.out.println(ans);
	}
}
