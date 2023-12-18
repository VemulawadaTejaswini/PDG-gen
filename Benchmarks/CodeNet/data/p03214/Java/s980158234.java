import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
      	//配列
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
        	a[i] = sc.nextInt();
        }
      	double he = 0;
      	for(int i = 0; i < n; i++){
          he += a[i];
        }
      	he = he/n;
      	double min = Math.abs(a[0]-he);
      	int index= 0;
      	for(int i = 1; i < n; i++){
          double diff = Math.abs(a[i] - he);
          if(diff<min){
            min = diff;
            index= i;
          }
        }
        System.out.println(index);
     }
}