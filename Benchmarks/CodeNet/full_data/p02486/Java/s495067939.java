import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int z=0;
		while(true){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==0 && y==0)break;
			for(int i=1;i<x+1;i++){
				for(int j=1;j<x+1;j++){
					for(int k=1;k<x+1;k++){
						if(y==(i+k+j)&& i>j && j>k){
							z++;
						}
					}
				}
			}
			System.out.printf("%d\n",z);
			z=0;
		}
	}
}