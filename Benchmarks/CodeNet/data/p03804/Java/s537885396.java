import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		String[]A = new String[N];
		String[]B = new String[M];
		
		
		for(int i = 0;i<N;i++){
			A[i] = scan.next();
		}
		
		for(int i = 0;i<M;i++){
			B[i] = scan.next();
		}
		
		//int count =0;
		
		
		String answer  = "NO";
		
		
		for(int i = 0;i<N-M+1;i++){
			for(int j = 0;j<N-M+1;j++){
				if(A[i].substring(j, j+M).equals(B[0])){//i行めのｊ番目を先頭にBの行がAに含まれているか探す
					//count +=1;
					int ok = 1;
					for(int z = 1;z<M;z++){
						if(!B[z].equals(A[i+z].substring(j, j+M))){//同じではない
							ok=0;
						}	
					}
					
					if(ok==1){//全部の行数があってたならOK=1のままなのでそれは含まれていることがわかる
						answer = "YES";
					}
					
					
					
				}
			}
				
		}
		
		
		System.out.println(answer);
		
		
		
		
		
	}

}
