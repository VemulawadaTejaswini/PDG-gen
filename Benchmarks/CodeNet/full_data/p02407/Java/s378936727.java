import java.util.Scanner; 
class Main {

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b[]=new int[1001];
		int x=0;
		while(x<a){
			b[x]=stdIn.nextInt();
			x++;
		}x=0;
		while(x<a){			
			    System.out.print((x+1==a)?b[a-1]:b[a-1]+" ");
			a--;
		}
	}

}