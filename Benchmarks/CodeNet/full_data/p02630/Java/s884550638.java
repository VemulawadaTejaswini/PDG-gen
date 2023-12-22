import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a  = new int[n];
      	int max = 0;
      	for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
      	int q = sc.nextInt();
      	int[] b = new int[q];
      	int[] c = new int[q];
      	for(int i=0;i<q;i++){
          b[i] = sc.nextInt();
          c[i] = sc.nextInt();
        }
      	int[] tmp = new int[100001];
      	for(int i=0;i<a.length;i++){
          tmp[a[i]] += 1;
        }
      	for(int i=0;i<tmp.length;i++){
          //System.out.println(tmp[i]);
        }
      	
      	for(int i=0;i<b.length;i++){
          long sum = 0;
          tmp[c[i]] += tmp[b[i]];
          tmp[b[i]] = 0;
          for(int j=0;j<tmp.length;j++){
            sum += tmp[j]*j;
          }
          System.out.println(sum);
        }
	}
}