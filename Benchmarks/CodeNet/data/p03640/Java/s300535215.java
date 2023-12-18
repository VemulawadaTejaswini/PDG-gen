import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      int[][] ans = new int[h][w];
      int i = 0;
      int j = 0;
      for(int c= 0;c < n;c++){
      	while(a[c]>0){
          ans[i][j]=c+1;
          a[c]--;
          j+=(i%2==0)?1:-1;
          if(j<0){
            i++;
            j=0;
          }else if(j>=w){
            i++;
            j=w-1;
          }
        }
      }
      for(int l = 0;l < h;l++){
        System.out.print(ans[l][0]);
      	for(int q = 1;q < w;q++){
        	System.out.print(" "+ans[l][q]);
        }
        System.out.println("");
      }
    }
}
