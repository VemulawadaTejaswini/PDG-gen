import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
      	for (int i;i<n;i++){
          a[i] = sc.nextInt();
        }
		int min = 10000;
      	int f = 0;
      	int l = 0;
		for (int i;i<n;i++){
          for (int j = 0;j<i;j++){
            f += a[j];
          }
          for (int j = i;j<n;j++){
            l += a[j];
          }
          if(min > Math.abs(f-l)){
            min = Math.abs(f-l);
          }
        }
		System.out.println(min);
	}
}