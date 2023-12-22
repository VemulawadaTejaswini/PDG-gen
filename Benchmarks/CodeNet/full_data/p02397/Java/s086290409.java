import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int x[]=new int[10000];
		int y[]=new int[10000];
		int i=0,j=0;
		Scanner br=new Scanner(System.in);
		while(((x[i]=br.nextInt())!=0)&&((y[i]=br.nextInt())!=0)){
			i++;
		}
		while((x[j]!=0)&&(y[j]!=0)){
			if(x[j]<y[j]){
				System.out.println(x[j]+" "+y[j]);
			}else{
				System.out.println(y[j]+" "+x[j]);
			}
			j++;
		}
	}
}