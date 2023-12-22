import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int x[]=new int[4000];
		int y[]=new int[4000];
		int i=0;
		Scanner br=new Scanner(System.in);
		while(((x[i]=br.nextInt())!=0)&&((y[i]=br.nextInt())!=0)){
			if(x[i]<y[i]){
				System.out.println(x[i]+" "+y[i]);
			}else{
				System.out.println(y[i]+" "+x[i]);
			}
			i++;
		}
	}
}