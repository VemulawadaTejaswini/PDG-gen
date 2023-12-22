import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int[] ts = new int[n+1];
			int[] te = new int[n+1];
			int[] a = new int[2*n+1];
			int q = 0, u, v;
			for(int i = 0; i < n; i++){
				ts[i] = Integer.parseInt((sc.next()).replaceAll(":", ""));
				te[i] = Integer.parseInt((sc.next()).replaceAll(":", ""));
				
				boolean af, bf;
				af = bf = true;
				for(int j = 0; j < q; j++){
					if(a[j] == ts[i]){
						af = false;
						if(!bf){
							break;
						}
					}
					if(a[j] == te[i]){
						bf = false;
						if(!af){
							break;
						}
					}
				}
				if(af){
					a[q++] = ts[i];
				}
				if(bf){
					a[q++] = te[i];
				}
			}
			
			for(int i = q-1; i >= 0; i--){
				for(int j = 1; j <= i; j++){
					if(a[j] < a[j-1]){
						u = a[j];
						a[j] = a[j-1];
						a[j-1] = u;
					}
				}
			}
			v = u = 0;
			boolean f = true;
			for(int i = 0; i < q; i++){
				for(int j = 0; j < n; j++){
					if(a[i] == te[j]){
						u--;
					}

					if(a[i] == ts[j]){
						u++;
					}
				}
			        if(u > v){
					v = u;
				}
			}
			
			System.out.println(Integer.toString(v));
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}