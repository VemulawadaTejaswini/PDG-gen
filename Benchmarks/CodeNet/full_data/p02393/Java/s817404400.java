import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x[]=new int[3],tmp;
		for(int i=0;i<x.length;i++) {
			x[i]=scan.nextInt();
		}
		for(int i=0;i<x.length-1;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>x[j]) {
					tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
		}
		System.out.println(x[0]+" "+x[1]+" "+x[2]);
        scan.close();
	}

}
