//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
				
		int[][] a;
		int[] b;
		int []c;
		try{Scanner sc =new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			a=new int[n][m];
			b=new int[m];
			c=new int[n];
			for(int i=0;i<n;i++){
				for(int l=0;l<m;l++){
					a[i][l]=sc.nextInt();
				}
			}
			for(int i=0;i<m;i++){
				b[i]=sc.nextInt();
			}sc.close();
			//////////////////////////////////////////////////////////
		    //ここまで入力部
		    //////////////////////////////////////////////////////////
		    //↓より計算部
			
			for(int i=0;i<n;i++){
				for(int l=0;l<m;l++){
					c[i]+=b[l]*a[i][l];
					}System.out.println(c[i]);
				}
			
			}//catch(FileNotFoundException ee){}
		catch(ArrayIndexOutOfBoundsException e){System.out.println("配列エラーです");}
		
		}
	}