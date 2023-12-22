import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int[] huda=new int[50];
		int[] hud2=new int[50];
 
		while(true){
			int n=s.nextInt();
			int r=s.nextInt();
			if(r==0&&n==0){
				break;
			}
			for(int i=0;i<n;i++){
				huda[i]=n-i;		
			}	
			for(int j=0;j<r;j++){	
				int p=s.nextInt();
				int c=s.nextInt();
				if(p<2){
					continue;
				}
				for(int i=0;i<c;i++){
					hud2[i]=huda[i];
					huda[i]=huda[p-1+i];
				}

				for(int i=0;i<n;i++){
					System.out.println(huda[i]+"...");
				}

				hud2[c]=huda[p-2];
				for(int i=0;i<p-1;i++){
					huda[c+i]=hud2[i];
				}

				for(int i=0;i<n;i++){
					System.out.println(huda[i]+"...");
				}
			}
			System.out.println(huda[0]);
		}
	}
}