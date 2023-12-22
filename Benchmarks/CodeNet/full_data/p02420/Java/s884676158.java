import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String input = br.readLine();
			
			if(input.equals("-")){
				break;

			}
			
			int m = Integer.parseInt(br.readLine());

			//StringBuffer sb = new StringBuffer();
			for(int i = 0; i < m ; i++){
				StringBuffer sb = new StringBuffer();
				int h = Integer.parseInt(br.readLine());
				
				sb.append(input.substring(h, input.length()));
				sb.append(input.substring(0, h));
				
				input = sb.toString();
//				System.out.println("i = "+i+" "+input);
			}
			
			System.out.println(input);

		}
		
//		System.out.println(count);

//
//			if(Character.isLowerCase(c)){
//				System.out.print(Character.toUpperCase(c));
//			}
//
//			else if(Character.isUpperCase(c)){
//				System.out.print(Character.toLowerCase(c));
//			}
//			else {
//				System.out.print(c);
//			}
//		}
//		System.out.println();

//		String[] tmpArray = br.readLine().split(" ");
//		int n = Integer.parseInt(tmpArray[0]);
//		int m = Integer.parseInt(tmpArray[1]);
//		int l = Integer.parseInt(tmpArray[2]);
//
//		long[][] a = new long[n][m];
//		long[][] b = new long[m][l];
//		long[][] c = new long[n][l];
//
//		for(int i = 0; i < n; i ++){
//			tmpArray = br.readLine().split(" ");
//			for(int j = 0; j < m; j++){
//				a[i][j] = Long.parseLong(tmpArray[j]);
//			}
//		}
//
//		for(int i = 0; i < m; i ++){
//			tmpArray = br.readLine().split(" ");
//			for(int j = 0; j < l; j++){
//				b[i][j] = Integer.parseInt(tmpArray[j]);
//			}
//		}
//
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < l; j++){
//				for(int k = 0; k < m; k++){
//					c[i][j] += a[i][k]*b[k][j];
//				}
//
//				if(j != 0 ){
//					System.out.print(" ");
//				}
//				System.out.print(c[i][j]);
//			}
//			System.out.println();
//		}


	}

}