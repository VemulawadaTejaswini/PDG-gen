import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c[][] = new int[4][4];
for(int i=1;i<=3;i++){
	for(int k=1;k<=3;k++){
		c[i][k]=sc.nextInt();
	}

}
boolean ans=true;
if(c[1][1]-c[1][2]!=c[2][1]-c[2][2]||c[1][1]-c[1][2]!=c[3][1]-c[3][2]||c[1][2]-c[1][3]!=c[2][2]-c[2][3]||c[1][2]-c[1][3]!=c[3][2]-c[3][3]){
	ans=false;
}

if(c[1][1]-c[2][1]!=c[1][2]-c[2][2]||c[1][1]-c[2][1]!=c[1][3]-c[2][3]||c[2][1]-c[3][1]!=c[2][2]-c[3][2]||c[2][1]-c[3][1]!=c[2][3]-c[3][3]){
	ans=false;
}

if(ans){
	System.out.println("Yes");
}else{
	System.out.println("No");
}

	}}