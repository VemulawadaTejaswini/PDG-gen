import java.util.Scanner;
class Main{

	public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a[] = new int[3];
for(int i=0;i<3;i++){
	a[i]=sc.nextInt();
}
int min=a[1];
int g=3;
for(int j=0;j<3;j++){
for(int i=0;g>i;i++){
	if(a[i]<min){
		int taihi=a[j];
		a[j]=a[i];
		a[i]=taihi;
	}
	g--;
}

}

System.out.println(a[0]+" "+a[1]+" "+a[2]);

    }
}