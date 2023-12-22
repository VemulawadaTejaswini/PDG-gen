import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    int data[][]=new int[101][101];
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            data[i][j]=sc.nextInt();
	            data[i][c]+=data[i][j];
	            data[r][j]+=data[i][j];
	        }
	        data[r][c]+=data[i][c];
	    }
	    for(int i=0;i<=r;i++){
	        for(int j=0;j<c;j++){
	            System.out.print(data[i][j]);
	            System.out.print(" ");
	        }
	        System.out.println(data[i][c]);
	    }
	    sc.close();
	}
}


