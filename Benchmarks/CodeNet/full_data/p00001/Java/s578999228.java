import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
Scanner kb=new Scanner(System.in);
int a[]=new int[10];
int list[]=new int[10];
int count=0;

for(int i=0;i<10;i++){
	a[i]=kb.nextInt();
}
for(int x=0;x<3;x++){
int max=a[0];
{
for(int i=0;i<10;i++){
	if(a[i]>max){
		max=a[i];

	}
}
list[count]=max;
count++;
for(int i=0;i<10;i++){
	if(a[i]==max){
		a[i]=0;
	}
}
a[0]=0;
}
}

for(int i=0;i<3;i++){
System.out.printf("%d\n", list[i]);
}
	}

}