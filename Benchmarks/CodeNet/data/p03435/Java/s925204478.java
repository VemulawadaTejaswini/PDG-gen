import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[][] c = new int[3][3];
      for(int i = 0;i < 3;i++){
      	for(int j = 0;j < 3;j++){
        	c[i][j]=sc.nextInt();
        }
      }
      if(c[1][1]==c[0][1]+c[1][0]-c[0][0]&&c[1][2]==c[1][0]+c[0][2]-c[0][0]&&c[2][1]==c[2][0]+c[0][1]-c[0][0]&&c[2][2]==c[2][0]+c[0][2]-c[0][0])System.out.println("Yes");
      else System.out.println("No");
    }
    public static int lcm(int x, int y){
      return x*y/gcd(x,y);
    }
    public static int gcd(int x, int y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}