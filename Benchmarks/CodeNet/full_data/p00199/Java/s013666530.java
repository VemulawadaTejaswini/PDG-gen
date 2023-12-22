import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			char[] a = new char[n+2];
			Arrays.fill(a,'#');
			a[0] = 'X';
			a[n+1] = 'X';
			for(int i=0;i<m;i++){
				char c = sc.next().charAt(0);
				if(c=='A'){
					for(int j=1;j<=n;j++){
						if(a[j]=='#'){
							a[j] = c;
							break;
						}
					}
				}else if(c=='B'){
					boolean flag = true;
					for(int j=n;j>0;j--){
						if(a[j]=='#' && a[j-1]!='A' && a[j+1]!='A'){
							a[j] = c;
							flag = false;
							break;
						}
					}
					if(flag==true){
						for(int j=1;j<=n;j++){
							if(a[j]=='#'){
								a[j] = c;
								break;
							}
						}
					}
				}else if(c=='C'){
					if(i==0){
						if(n%2==0) a[(n+1)/2] = c;
						else a[n/2+1] = c;
					}else{
						for(int j=1;j<=n;j++){
							if(a[j]!='#'){
								if(a[j+1]=='#'){
									a[j+1] = c;
									break;
								}
								if(a[j-1]=='#'){
									a[j-1] = c;
									break;
								}
							}
						}
					}
				}else if(c=='D'){
					if(i==0){
						a[1] = c;
					}else{
						int max = -1;
						int p = -1;
						for(int j=1;j<=n;j++){
							if(a[j]=='#'){
								int min = Integer.MAX_VALUE;
								for(int k=j-1;k>=0;k--){
									if(k==0) break;
									if(a[k]!='#'){
										min = Math.min(min, j-k+1);
										break;
									}
								}
								for(int k=j+1;k<=n+1;k++){
									if(k==n+1) break;
									if(a[k]!='#'){
										min = Math.min(min, k-j+1);
										break;
									}
								}
								if(min>max){
									max = min;
									p = j;
								}
							}
						}
						a[p] = c;
					}
				}
			}
			for(int i=1;i<=n;i++) System.out.print(a[i]);
			System.out.println();
		}
	}
}