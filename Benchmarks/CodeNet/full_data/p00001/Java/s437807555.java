import java.util.Scanner;


public class Main {
	public int a[]= new int[10];
	public void topThree(){
		
	}
	public void order(){
		int temp;
		int i,j;
		for(i=0;i<3;i++)
			for(j=i;j<10;j++){
				if(a[i]<a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
	}
	public void display(){
		int i;
		for(i=0;i<3;i++){
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Main m=new Main();
		int i=0;
		for(i=0;i<10;i++){
			m.a[i]=sc.nextInt();
		}
		m.order();
		m.display();
		
	}
	
}