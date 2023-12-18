import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int a[] = new int[n];
        int x[][] = new int[n][n];
        int y[][] = new int[n][n];
        int i,j,k;
        for(i = 0;i < n; i++){
          a[i] = sc.nextInt();
          for(j = 0;j < a[i];j++){
            x[i][j] = sc.nextInt() - 1;
            y[i][j] = sc.nextInt();
          }
        }
        int ans = 0,count = 0;
        boolean check = false;
      
		for(i = 0; i < (int)Math.pow(2,n); i++){
            //System.out.println(count);
            count = 0;
         	check = true;
			for(j = 0; j < n; j++){
              if((1&i>>j)==1){
                count += 1;
                for(k = 0;k < a[j];k++){
                  if(y[j][k] == 1){
                    if(!((1&i>>(x[j][k]))==1)){
                		check = false;
                    }
                  }else{
              		if(!((1&i>>(x[j][k]))==0)){
                		check = false;
             		 }
            	  }
                }
              }
            }
            System.out.println(check);
            if(check == true){
                if(count > ans){
                 ans = count; 
                }
            }
		}
       	System.out.println(ans);
    }
}