import java.util.Scanner;
public class Main {
	static int mcnt = 0;

	public static void loop(int i,int pointer,int sum[][],int sum_copy[][],int n,int m){
		int g_n =n;
		int g_m = m;
		int min = 999999;
		int point1 = pointer;
		int point2 = pointer+1;
		int buf = g_m-(g_n-point1-2);
		int buf1 = g_m-(g_n-point2-1);
		int l,o,p;
		if(point2 >= g_n){
			//System.out.println(cnt+":]");
			//return 0;
		}else{
			for(l = i+1;l <buf ;l++){
				pointer = point1;
				for(o = l+1;o < buf;o++){
					pointer = point2;
					for(p= o;p < buf1;p++){//10
						//System.out.print(p+"+");
						loop(p-1,pointer,sum,sum_copy,g_n,g_m);
						//mcnt++;
						if(p == o){
							min = sum[pointer][p];
						}
						min = Math.min(min,sum[pointer][p]);
	/*					if(min > sum[pointer][p]){
							min = sum[pointer][p];
						}
						*/
						if(p == buf1-1){							
							if((sum[pointer-1][l] != sum_copy[pointer-1][l] && sum[pointer-1][l] > sum_copy[pointer-1][l]+min) ||(sum[pointer-1][l] == sum_copy[pointer-1][l])){
								sum[pointer-1][l] += min; 
							}	
						}
						
					}
				}
			}			
		}

	}
	//????????????
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min = 99999999;
		int pointer = 0;
		//n = 5
		//m = 10??¨??????
		int dis[] = new int[n];
		int wea[] = new int[m];
		int sum[][] = new int[n][m];
		int sum_copy[][] = new int[n][m];
		int i,j;
		for(i = 0;i < n;i++){
			dis[i] = sc.nextInt();
		}
		for(i = 0;i < m;i++){
			wea[i] = sc.nextInt();
		}
		for(i = 0;i < n;i++){
			for(j = 0;j < m;j++){
				if(i > j || j-i > m-n){
					sum[i][j] = -1;
					sum_copy[i][j] = -1;
				}else{
					sum[i][j] = dis[i]*wea[j];
					sum_copy[i][j] = sum[i][j];

				}
			}
		}

		//System.out.print(m);
				
		/*
		for(i = 0;i <m-n ;i++){//5
			pointer=0;
			for(j = i+1;j <m-(n-pointer-2);j++ ){//10-(4-0)
			pointer=1;
				for(int k = j+1;k < m-(n-pointer-2);k++){//10-(4-1)
			pointer=2;
					for(int l= k+1;l < m-(n-pointer-2);l++){//8
			pointer=3;
						for(int o= l+1;o < m-(n-pointer-2);o++){//9
							//System.out.print("o="+o+":"+n+":"+pointer+":"+(m-(n-pointer-1))+":");
			pointer=4;
							for(int p= o;p < m;p++){//10
								if(p == o){
									min = sum[pointer][p];
								}
								if(min > sum[pointer][p]){
									min = sum[pointer][p];
								}
								if(p == m-1){							
									if((sum[pointer-1][l] != sum_copy[pointer-1][l] && sum[pointer-1][l] > sum_copy[pointer-1][l]+min) ||(sum[pointer-1][l] == sum_copy[pointer-1][l])){
										System.out.println("k"+k+"j"+j+"j"+j+"pointer"+pointer);
										sum[pointer-1][l] += min; 
									}	
								}
							}
						}

					}	
				}
			}
		}
		*/
		loop(-1,0,sum,sum_copy,n,m);
		//loop4(5);
		min = sum[0][0];
		for(i = 0;i < m-n;i++){
			if(min > sum[0][i]){
				min = sum[0][i];
			}
		}
/*
		for(i = 0;i < n;i++){
			for(j = 0;j < m;j++){
				//System.out.print(sum[i][j]+":");	
			}
			//System.out.println();
		}	

*/		System.out.println(min);

	}
}