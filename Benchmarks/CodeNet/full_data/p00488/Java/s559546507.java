import java.util.*;

class Main{

    public static void main(String[] args){
	int[] a = new int[3];
	int[] b = new int[2];
	Scanner in = new Scanner(System.in);

	a[0] = in.nextInt();
	a[1] = in.nextInt();
	a[2] = in.nextInt();
	b[0] = in.nextInt();
	b[1] = in.nextInt();

	int min1=5000,min2=5000;

	for(int i=0;i<3;i++){
	    if(min1>a[i])min1=a[i];
	}
	for(int i=0;i<2;i++){
	    if(min2>b[i])min2=b[i];
	}

	System.out.println(min1+min2-50);


    }

}