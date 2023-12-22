import java.util.Scanner;

public class Main {
	
	static int S ;
	static double EPS=1e-9;
	static int[] ans;
	
	static boolean gauss(int[][] A) {
        
//      for(int i=0; i<=d; i++) {
//          for(int j=0; j<=d+1; j++) {
//              System.out.print(A[i][j]);
//              if(j!=d+1) System.out.print(" ");
//          }
//          System.out.println();
//      }
         
        for(int i=0; i<S; i++) {
            int pivot=i;
            for(int j=i; j<S; j++) {
                if(Math.abs(A[j][i])>Math.abs(A[pivot][i])) {
                    pivot=j;
                }
            }
             
            //System.out.println("pivot="+pivot);
             
            for(int j=0; j<S+1; j++) {
                int a=A[i][j];
                A[i][j]=A[pivot][j];
                A[pivot][j]=a;
            }
             
//          for(int x=0; x<=d; x++) {
//              for(int j=0; j<=d+1; j++) {
//                  System.out.print(A[x][j]);
//                  if(j!=d+1) System.out.print(" ");
//              }
//              System.out.println();
//          }
             
            if(Math.abs(A[i][i])<EPS) {
                return false;
            }
             
            for(int j=i+1; j<S+1; j++) {
                A[i][j]/=A[i][i];
            }
            A[i][i]/=A[i][i];//基準値を1にする
             
            for(int j=0; j<S; j++) {
                if(i!=j) {
                    for(int k=i+1; k<S+1; k++) {
                        A[j][k]-=A[j][i]*A[i][k];
                        //System.out.println("A["+j+"]["+i+"]="+A[j][i]+"*A["+i+"]["+k+"]="+A[i][k]);
                    }
                    A[j][i]-=A[j][i]*A[i][i];
                }
            }
             
//          System.out.println();
//          for(int x=0; x<=d; x++) {
//              for(int j=0; j<=d+1; j++) {
//                  System.out.print(A[x][j]);
//                  if(j!=d+1) System.out.print(" ");
//              }
//              System.out.println();
//          }
             
        }
         
        for(int i=0; i<S; i++) {
            ans[i]=A[i][S];
            //System.out.println("ans["+i+"]="+ans[i]);
        }
        return true;
    }
	
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int m=sc.nextInt();
				int n=sc.nextInt();
				int d=sc.nextInt();
				if(m==0) break;
				int[][] s=new int[n][m];
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						s[i][j]=sc.nextInt();
					}
				}
				S=n*m;
				int[][] mt=new int[m*n][m*n+1];
				ans=new int[m*n];
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						if(s[i][j]==1) {
							mt[i*m+j][n*m]=1;
							//System.out.println("mt["+(i*m+j)+"]["+n*m+"]=1");
						}
					}
				}
				System.out.println();
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						mt[i*m+j][i*m+j]=1;
						//System.out.println("mt["+(i*m+j)+"]["+(i*m+j)+"]=1");
						for(int k=0; k<=d; k++) {
							for(int l=0; l<4; l++) {
								int ny=i+((l&1)==1? k:-k);
								int nx=j+(((l>>1)&1)==1 ? d-k:k-d);
								if(0<=ny && ny<n && 0<=nx && nx<m) {
									mt[ny*m+nx][i*m+j]=1;
								}
							}
						}
					}
				}
				
//				for(int i=0; i<S; i++) {
//					for(int j=0; j<S+1; j++) {
//						System.out.print(mt[i][j]);
//						if(j!=S) System.out.print(" ");
//					}
//					System.out.println();
//				}
//				System.out.println();
				
				System.out.println(gauss(mt)? 1:0);
				
//				for(int i=0; i<S; i++){
//					boolean found = false;
//					int key = -1;
//					for(int k=i; k<S; k++){
//						if(mt[k][i] == 1){
//							found = true;
//							key = k;
//							break;
//						}
//					}
//					if(found){
//						int[] tmp = mt[i].clone();
//						mt[i] = mt[key].clone();
//						mt[key] = tmp;
//						for(int k=i+1; k<S; k++)if(mt[k][i] == 1){
//							for(int j=i; j<=S; j++){
//								mt[k][j] ^= mt[i][j];
//							}
//						}
//					}
//				}
//				
//				for(int i=S-1; i>=0; i--){
//					if(mt[i][i] == 1){
//						for(int k=i-1; k>=0; k--)if(mt[k][i] == 1){
//							for(int j=S; j>=i; j--){
//								mt[k][j] ^= mt[i][j];
//							}
//						}
//					}
//				}
//				boolean tf=true;
//				for(int i=0; i<S; i++){
//					if(mt[i][i] == 0 && mt[i][S] == 1){
//						tf=false;
//					}
//				}
//				System.out.println(tf? 1:0);
				
			}
		}
	}
}
