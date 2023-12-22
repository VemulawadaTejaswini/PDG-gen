import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			
			for(int i=0;i<n;i++){
				int[] t = new int[9];
				int[][] m = new int[3][10];
				for(int j=0;j<9;j++) t[j] = sc.nextInt();
				
				int rc = 0;
				int gc = 0;
				int bc = 0;
				String s;
				for(int j=0;j<9;j++){
					s = sc.next();
					if(s.compareTo("R")==0){
						rc++;
						m[0][t[j]]++;
					}else if(s.compareTo("G")==0){
						gc++;
						m[1][t[j]]++;
					}else{
						bc++;
						m[2][t[j]]++;
					}
				}
				if(rc%3==0 && gc%3==0 && bc%3==0){
					boolean flag = true;
					for(int k=0;k<3;k++){
						if(flag==true){
							for(int j=1;j<=9;j++){
								if(m[k][j]<0 || (j>7 && m[k][j]%3!=0)){
									flag = false;
									break;
								}
								if(m[k][j]==1 || m[k][j]==4){
									m[k][j]--;
									m[k][j+1]--;
									m[k][j+2]--;
								}else if(m[k][j]==2){
									m[k][j]-=2;
									m[k][j+1]-=2;
									m[k][j+2]-=2;	
								}
							}
						}
					}
					if(flag==true) System.out.println(1);
					else System.out.println(0);
				}else{
					System.out.println(0);
				}	
			}	
		}	
	}	
}