import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		int h[]=new int[1000],w[]=new int[1000];
		int i=0;
		int t;
		while(true){
			h[i]=kb.nextInt();
			w[i]=kb.nextInt();
			if(h[i]==0&&w[i]==0){
				t=i;
			break;
			}
			i++;
		}
		i=0;
		for(int a=0;a<h.length-1;a++){
				for(int j=0;j<h[i];j++){
					for(int k=0;k<w[i];k++){
						System.out.print("#");
					}
					System.out.println();
				}
				i++;
			System.out.println();
				}
}	
}