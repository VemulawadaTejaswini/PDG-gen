import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			
			String s = String.valueOf(N);
			int sentou = Integer.valueOf(s.substring(0, 1));
			int matubi = Integer.valueOf(s.substring(s.length()-1, s.length()));
			int ketasuu = s.length();
			
			
			long count = 0;
			
			if(N<=9) {
				System.out.println(N);
				return;
			}
			
			//Nが二桁以上を想定
			for(int i = 1;i<=N;i++) {
				String x = String.valueOf(i);
				int sen = Integer.valueOf(x.substring(0, 1));
				int mat = Integer.valueOf(x.substring(x.length()-1, x.length()));
				int keta = x.length();
				
				
				
				int bsen = mat;
				int bmat = sen;
				int B = bsen*kaijyou(10,ketasuu-1)+bmat;
				
				if(bsen==0)continue;
				System.out.println(B);
				if(B<=N) {
					count+=(kaijyou(10,ketasuu-1)-1)/9;
					if(bsen==bmat)count++;
					/*System.out.print(bsen);
					System.out.print(" ");
					System.out.print(bmat);
					System.out.println();
					System.out.println(count);
					System.out.println();*/
				}else{
					if(ketasuu==2&&bsen==bmat) {count++;
					/*System.out.print(bsen);
					System.out.print(" ");
					System.out.print(bmat);
					System.out.println();
					System.out.println(count);
					System.out.println();*/
					}
					
					if(ketasuu>=3) {
						count+=(kaijyou(10,ketasuu-1-1)-1)/9;
						if(bsen==bmat)count++;
						/*System.out.print(bsen);
						System.out.print(" ");
						System.out.print(bmat);
						System.out.println();
						System.out.println(count);
						System.out.println();*/
						
					}
				}
				
				
				
			/*
					if(bsen<=sentou) {
						if(bmat<=matubi) {
							count+=(kaijyou(10,ketasuu-1)-1)/9+1;
						}else if(bmat>matubi) {
							if(ketasuu>=3) {
								count+=(kaijyou(10,ketasuu-1-1)-1)/9+1;
							}else {
								if(bsen==bmat)count++;
							}
						}
						count+=(kaijyou(10,ketasuu-1)-1)/9+1;
						System.out.print(bsen);
						System.out.print(" ");
						System.out.print(bmat);
						System.out.println();
						System.out.println(count);
						System.out.println();
					}else if(bsen>sentou) {
						if(bmat<=matubi) {
							if(ketasuu>=3) {
								count+=(kaijyou(10,ketasuu-1-1)-1)/9+1;
							}else {
								if(bsen==bmat)count++;
							}
						}else if(bmat>matubi) {
							if(ketasuu>=4) {
								count+=(kaijyou(10,ketasuu-1-1-1)-1)/9+1;
							}else {
								if(bsen==bmat)count++;
							}
						}
					}
					
				}
				
				
			*/
			
			}
			
			
			
			System.out.println(count);
			
			
		}
		
		
	}
	
	
	private static int kaijyou (int n,int x) {
		if(x==0)return 1;
		if(x==1)return n;
		return n*kaijyou(n,x-1);
		
		
	}
		

}
