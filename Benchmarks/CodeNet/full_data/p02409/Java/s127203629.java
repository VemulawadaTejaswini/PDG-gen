import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new TEST().doIt();
    }
    class TEST{
        void doIt(){
        	int n = sc.nextInt() + 1;
        	int house[][][] = new int [4][3][10];
        	for(int i = 0;i < n-1;i++){
        		int t = sc.nextInt()-1;
        		int h = sc.nextInt()-1;
        		int w = sc.nextInt()-1;
        		int num = sc.nextInt();
        		house[t][h][w] = house[t][h][w] + num;
        		if(house[t][h][w] < 0)house[t][h][w] = 0;
        	}
        	for(int i = 0;i < 4;i++){
        		for(int j = 0;j < 3;j++){
        			for(int k = 0;k < 10;k++){
        				System.out.print(" "+house[i][j][k]);
        			}
        			System.out.println();
        		}
        		if(i != 3)System.out.println("####################");
        	}
        }
    }
}