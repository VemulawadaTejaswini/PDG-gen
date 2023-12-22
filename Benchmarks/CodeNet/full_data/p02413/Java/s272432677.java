import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int r=sc.nextInt();
        int c=sc.nextInt();
	int[][]x=new int[r+1][c+1];
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
		x[i][j]=sc.nextInt();
		x[i][c]+=x[i][j];
	    }
	}
	for(int i=0;i<r;i++)for(int j=0;j<c+1;j++)x[r][j]+=x[i][j];
	for(int i=0;i<r+1;i++){
	    for(int j=0;j<c;j++)System.out.print(x[i][j]+" ");
	    System.out.println(x[i][c]);
	}
    }
    public static void main(String[]ag){
	new Main().main();
    }
}