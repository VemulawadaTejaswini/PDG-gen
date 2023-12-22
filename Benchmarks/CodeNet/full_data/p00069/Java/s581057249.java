import java.util.Scanner;


public class Main {
	
	public static boolean accept(int m,int c,int amida[][]){
		for(int row[]:amida){
			if(m > 1 && row[m-2] == 1){
				m--;
			}else if(m < (row.length+1) && row[m-1] == 1){
				m++;
			}
		}
		
		return (m == c);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n,m,c,d;
			n = sc.nextInt();
			if(n == 0){break;}
			m = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			
			int amida[][] = new int[d][n-1];
			for(int j = 0;j < amida.length; j++){
				amida[j] = new int[n-1];
				char s[] = sc.next().toCharArray();
				for(int i = 0;i < (n-1);i++){
					amida[j][i] = s[i] - '0';
				}
			}
			
			if(accept(m,c,amida)){
				System.out.println("0");
				continue;
			}
			
			int trace_m = m;
			boolean find = false;
			for(int i = 0;i < amida.length;i++){
				if(trace_m > 1 && amida[i][trace_m-2] == 1){
					trace_m--;
					continue;
				}else if(trace_m < amida[i].length && amida[i][trace_m-1] == 1){
					trace_m++;
					continue;
				}
				
				if(trace_m == 2 || amida[i][trace_m-3] == 0){
					amida[i][trace_m-2] = 1;
					if(accept(m,c,amida)){
						find = true;
						System.out.println((i+1) + " "+ (trace_m-1));
						break;
					}
					amida[i][trace_m-2] = 0;
				}
				
				if(trace_m == (n-1) || amida[i][trace_m] == 0){
					amida[i][trace_m-1] = 1;
					if(accept(m,c,amida)){
						find = true;
						System.out.println((i+1) + " "+ trace_m);
						break;
					}
					amida[i][trace_m-1] = 0;
				}
			}
			
			if(!find){
				System.out.println("1");
			}
		}
	}
}