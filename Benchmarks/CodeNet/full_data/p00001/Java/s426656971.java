import java.util.Scanner;
class mountain {
	public static void main(String[] args) {
		int[] a=new int[10];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		for(int m=1;m<=10;m++){
			a[m-1]=sc.nextInt();
		}
		for(i=1;i<10;i++){
			for(j=0;j<10-i;j++){
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int k=0;k<=2;k++){
			System.out.println(a[k]);
		}
	}
}