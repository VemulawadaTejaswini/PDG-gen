import java.util.*;
import java.io.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	long DP(int a[],int n){
		long array[] = new long [21];
		array[a[0]] = 1;
		for(int i = 1;i < n-1;i++){
			long array2[] = new long [21];
			for(int j = 0;j < 21;j++){
				if(j - a[i] >= 0){
					array2[j-a[i]] = array2[j-a[i]] + array[j];
				}
				if(j + a[i] < 21){
					array2[j+a[i]] = array2[j+a[i]] + array[j];
				}
			}
			for(int j = 0;j < 21;j++){
				array[j] = array2[j];
			}
		}
		return array[a[n-1]];
	}
	void doIt() {
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println(DP(a,n));
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}