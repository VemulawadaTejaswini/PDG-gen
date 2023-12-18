import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] a = new long[n];
        long[] x = new long[q];
        long[] ans = new long[q];

        for(int i=0; i<n; i++){
        	a[i] = sc.nextLong();
        }
        for(int i=0; i<q; i++){
        	x[i] = sc.nextLong();
        	ans[i] = 0;
        }

        for(int i=0; i<q; i++){

        	long[] a2 = new long[n];
        	for(int m=0; m<n; m++){
        		a2[m] = a[m];
            }

        	for(int j=0; j<n; j++){
        		if(j%2 == 0){
        			long max=a2[0];
        			int index=0;
        			for(int k=0; k<n; k++){
        				if(a2[k] >=0 && a2[k] > max){
        					max = a2[k];
        					index = k;
        				}
        			}
        			ans[i] += max;
        			a2[index] = -1;
        		}else{
        			long min=200000;
        			int index=0;
        			for(int k=0; k<n; k++){
        				if(a2[k] >= 0){
        					if(Math.abs(a2[k]-x[i]) < min){
        						min = Math.abs(a2[k]-x[i]);
        						index = k;
        					}else if(Math.abs(a2[k]-x[i]) == min){
        						if(a2[k] < a2[index]){
        							index = k;
        						}
        					}
        				}
        			}
        			a2[index] = -1;
        		}
        	}
        }

        for(int i=0; i<q; i++){
        	System.out.println(ans[i]);
        }
    }
}