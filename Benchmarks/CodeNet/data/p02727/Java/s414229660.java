import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int  x=scn.nextInt();
		int y=scn.nextInt();
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int []arr =new int[a];
		int [] arr1=new int[b];
           int [] arr2=new int[c];
           for(int i=0;i<a;i++){
        	   arr[i]=scn.nextInt();
           }
          for(int i=0;i<b;i++){
        	  arr1[i]=scn.nextInt();
          }
          for(int i=0;i<c;i++){
        	  arr2[i]=scn.nextInt();
        	  
          }
          Arrays.sort(arr);
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          int [][][][]ans =new int[a][x+1][b][y+1];
         
          System.out.println(res(arr,arr1 ,arr2 ,0,0,0, x, y,ans));
	}
	public static int res(int [] arr1,int [] arr2 ,int [] arr3,int i ,int j ,int k ,int x,int y,int [][][][]ans){
		if(x==0&& y==0){
			return 0;
		}
		if(x<0 ||y<=0){
			return 0;
		}
		if(i>=arr1.length || j>=arr2.length|| k>=arr3.length){
			return 0;
		}
		if(ans[i][x][j][y]!=0){
			return ans[i][x][j][y];
		}
		int res1 = res(arr1,arr2,arr3,i+1,j,k,x-1,y,ans)+arr1[arr1.length-1-i];
		int res2 = res(arr1,arr2,arr3,i,j+1,k,x,y-1,ans)+arr2[arr2.length-1-j];
		int res3 =res(arr1,arr2,arr3,i,j,k+1,x-1,y,ans)+arr3[arr3.length-1-k];
		int res4 =res(arr1,arr2,arr3,i,j,k+1,x,y-1,ans)+arr3[arr3.length-1-k];
		
		int val= Math.max(res1,Math.max(res2, Math.max(res3, res4)));
		ans[i][x][j][k]=val;
				return val;
	}

}