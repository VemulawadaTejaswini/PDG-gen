import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),m=sc.nextInt(),count=0;
    int[] h=new int[n];
    int[][] a=new int[n][n];
    for(int i=0;i<n;i++)h[i]=sc.nextInt();
    
    for(int i=0;i<m;i++) {
    	int x=sc.nextInt()-1,y=sc.nextInt()-1;
    	a[x][y]=h[y];
    	a[y][x]=h[x];
    }
    for(int i=0;i<n;i++) {
    	int[] buff=a[i];
    	Arrays.sort(buff);
    	if(buff[n-1]<h[i])count++;
    }
    System.out.println(count);
  }
}
