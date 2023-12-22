import java.io.IOException;
import java.util.Scanner;
public class Main {
public static void main(String[] args) throws IOException {
Scanner scan=new Scanner(System.in);
int x=0;
int i=0;
int y=0;
int a[]=new int[100000];
int b[]=new int[100000];//
do {
	a[x]=scan.nextInt();
b[x]=scan.nextInt();
	if(a[x]==0&&b[x]==0) {
		break;
	}
x++;
}while(true);
x=0;
do {
		if(a[x]==0&&b[x]==0) {
	break;
}

do {	

	do {
		System.out.print("#");
		i++;
	}while(i!=b[x]);
	i=0;
	System.out.println();
	y++;
}while(y!=b[x]);
y=0;
x++;
System.out.println();
}while(true);
scan.close();
	}
}