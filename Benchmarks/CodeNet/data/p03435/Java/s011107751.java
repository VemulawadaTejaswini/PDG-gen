import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		String ans = "No";
		
		for(int i=0; i<3; i++){
		    for(int j=0; j<3; j++){
		        c[i][j] = sc.nextInt();
		    }
		}
		
		if(c[0][2]-c[0][1] == c[1][2]-c[1][1] && c[1][2]-c[1][1] == c[2][2]-c[2][1]){
		    if(c[0][1]-c[0][0] == c[1][1]-c[1][0] && c[1][1]-c[1][0] == c[2][1]-c[2][0]){
		        if(c[2][0]-c[1][0] == c[2][1]-c[1][1] && c[2][1]-c[1][1] == c[2][2]-c[1][2]){
		            if(c[1][0]-c[0][0] == c[1][1]-c[0][1] && c[1][1]-c[0][1] == c[1][2]-c[0][2]){
		                ans = "Yes";
		            }
		        }
		    }
		}
      	System.out.println(ans);
    }
}