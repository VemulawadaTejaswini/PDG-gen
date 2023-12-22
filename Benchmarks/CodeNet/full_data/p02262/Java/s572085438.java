import java.util.Scanner;

class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
		int cnt, m;
		for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
		cnt = 0;
		int x = 4;
		int c = 1;
		int d = 3;
		while(true){
			if(n/x == 0 || x == 3){
				break;
			}
			d *= 3;
			x += d;
			c += 1;
		}
		m = c;
		System.out.println(m);
		
		int G[] = new int[m];
		int touhi = 3;
		G[m-1] = 1;
		for(int i = m-2; i >= 0; i--){
			G[i] = G[i+1]+touhi;
			touhi *= 3;
		}
		for(int i = 0; i < m; i++){
			System.out.print(G[i]+" ");
		}
		System.out.println("");
		
		for(int k = 0; k < m; k++){
			cnt = insertion(a, n, G[k], cnt);
		}
		System.out.println(cnt);
		for(int i = 0; i < n ; i++){
			System.out.println(a[i]);
		}
	}
    	
	private static int insertion(int a[], int n, int g, int cnt){
		for(int i = g; i < n; i++){
        	int v, j;
            v = a[i];
            j = i - g;
            while(j >= 0 && a[j] > v){
                a[j+g] = a[j];
                j = j - g;
            	cnt++;
            }
            a[j+g] = v;
        }
		return cnt;
    }
}
