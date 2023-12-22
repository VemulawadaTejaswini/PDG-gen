import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

while (true) {

int H = sc.nextInt();

int W= sc.nextInt();

if (H == 0 && W == 0) {

break;

}
for(int i=1;i<H-1;i++){
	for(int j=1;j<W-1;j++){
		if((i+j)%2==1) System.out.print(".");
			else System.out.print("#");
System.out.printf("\n");
}

}

}
}
}