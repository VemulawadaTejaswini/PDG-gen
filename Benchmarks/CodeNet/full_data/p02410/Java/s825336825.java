import 	java.util.Scanner;
public class Main{
	public static void main(String[] agrs){
    Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
        int m=s.nextInt();
        
        int[][] a=new int[n][m];
       	int[] b=new int[m];
        int[] c =new int[n];
       
            for(int i=0;i<n;i++){
            	for(int j=0;j<m;j++){
                	a[i][j]=s.nextInt();
                }
            }
            for(int i=0;i<m;i++){
            	b[i]=s.nextInt();
            }
        for(int i=0;i<n;i++){
        	for(int o=0;o<m;o++){
          		c[i]+=a[i][o]*b[o];
            }
        }
        for(int i=0;i<n;i++){
        		System.out.println(c[i]);
        }
        
        s.close();
    }
}
