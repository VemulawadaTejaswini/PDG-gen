import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int A[]=new int[3];
		
		for(int i=0;i<3;i++){
			A[i]=s.nextInt();
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					if(A[i]==5&&A[j]==7&&A[k]==5){
						System.out.print("YES");
						return;
					}
				}
			}
		}
		System.out.print("NO");
		
		

	}

}