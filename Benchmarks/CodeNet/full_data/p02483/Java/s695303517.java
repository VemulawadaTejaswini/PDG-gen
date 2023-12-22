import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);

		int x[]=new int[5];

		for(int i=0;i<3;i++) x[i]=stdIn.nextInt();
		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++){
				if(x[i]>x[j]){
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
		}
		System.out.println(x[0]+" "+x[1]+" "+x[2]);
	}
}