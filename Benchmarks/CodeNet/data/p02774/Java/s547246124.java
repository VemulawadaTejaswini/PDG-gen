import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int[] tmp = new int[n];
      	int[] a = new int[n*(n-1)/2];
      	for(int i=0;i<tmp.length;i++){
          tmp[i] = sc.nextInt();
        }
      	int cnt = 0;
      	for(int i=0;i<tmp.length;i++){
          for(int j=i+1;j<tmp.length;j++){
            a[cnt] = tmp[i] * tmp[j];
            cnt++;
          }
        }
      	Arrays.sort(a);
      	System.out.println(a[k-1]);
	}
}