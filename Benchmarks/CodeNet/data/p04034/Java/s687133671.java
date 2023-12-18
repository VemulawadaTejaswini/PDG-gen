
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        int[] y = new int[m];
        int red = 0;
        int[] num = new int[n];
        Arrays.fill(num, 1);
        boolean[] flag = new boolean[n];
        Arrays.fill(flag, false);
        for(int i=0;i<m;i++){
        	x[i] = sc.nextInt()-1;
        	y[i] = sc.nextInt()-1;
        }

        for(int i=0;i<m;i++){
        	if(num[x[i]]==1 && x[i]==red){
        		num[x[i]]--;
        		red = y[i];
        		num[y[i]]++;
        		flag[x[i]] = false;
        	}
        	else if(num[x[i]]>1 && (x[i]==red || flag[x[i]])){
        		num[x[i]]--;
        		red = y[i];
        		num[y[i]]++;
        		flag[x[i]] = true;
        	}
        	else if(num[x[i]]==1){
        		num[x[i]]--;
        		num[y[i]]++;
        		flag[x[i]] = false;
        	}
        }

        int count = 0;
        for(int i=0;i<n;i++){
        	if(flag[i] || red==i){
        		count++;
        	}
        }

        System.out.println(count);

    }
}