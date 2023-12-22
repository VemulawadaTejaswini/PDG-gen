import java.util.Scanner;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
int s=1;
int t=1;
	while(s!=0 && t!=0){
		int x = sc.nextInt();
		int y = sc.nextInt();
		 s=x;
		 t=y;
		 for(int j=0;j<y;j++){
 
		for(int i=0;i<x;i++){
			System.out.print("#");
		}
		System.out.print("\n");
		
	}


	}
}
}