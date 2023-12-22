import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int h= sc.nextInt();//tate
      	int x=sc.nextInt();//yoko
      	int k=sc.nextInt();
      	int c[][] = new int[h][x];
      	String string[][]=new String[h][x];
      	int ans=0;
      	for (int i = 0; i < h; i++) {
			for (int j = 0; j < x; j++) {
				string[i][j]=sc.next();
			}
		}
      for (int i = 0; i < h; i++) {
			for (int j = 0; j < x; j++) {
				if(string[i][j].equals(".")){c[i][j]=0;}
				else if(string[i][j].equals("#")){c[i][j]=1;}
			}
		}
      	int tate[]=new int[h];
      	int yoko[]=new int[x];
      	for(int i=0;i<Math.pow(2, h)-1;i++){
      		for(int j=0;j<Math.pow(2, x)-1;j++){
      			for(int p=0;p<h;p++){
      				tate[p]=i%2;
      				i=i/2;
      			}
      			for(int p=0;p<h;p++){
      				yoko[p]=i%2;
      				i=i/2;
      			}
      			int all=0;
      			for (int p = 0; p < h; p++) {
      				for (int q = 0; q < x; q++) {
      					if(tate[p]==0&&yoko[q]==0){
      						all=all+c[p][q];
      					}
      				}
      			}
      			if(all==k){
      				ans++;
      			}
      		}
      	}
      	System.out.println(""+ans);
}
}