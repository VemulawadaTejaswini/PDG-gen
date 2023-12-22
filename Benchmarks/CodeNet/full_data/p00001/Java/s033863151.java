import java.util.Scanner;
class mountain {
	public static void main(String[] args) {
		int[] a=new int[10];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		for(int m=1;m<=10;m++){
			a[m-1]=sc.nextInt();
		}
		for(i=0;i<3;i++){
			for(j=i;j<10;j++){
				if(a[i]<=a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					}
				}
			}
		for(int k=0;k<=2;k++){
			System.out.println(a[k]);
		}
	}
}