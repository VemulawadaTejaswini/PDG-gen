import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
      	int h = in.nextInt();
      	int w = in.nextInt();
      	char[][] a = new char[w][h];
      	for(int i = 0; i < h;i++){
        	a[i] = in.next().toCharArray();
        }
      	for(int i = 0 ; i < h ; i++){
        	for(int j = 0 ; j < w;j++){
            	System.out.print(a[i][j]);
            }
          	System.out.println();
          	for(int j =0; j < w; j++){
            	System.out.print(a[i][j]);
            }
          	System.out.println();
        }
    }
}