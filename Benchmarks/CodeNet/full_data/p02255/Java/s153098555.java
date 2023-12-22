import java.util.Scanner;

public class Main {
public static void main(String args[]) {
	int x;
	int j;
	int key;
	Scanner num = new Scanner(System.in);
	x = num.nextInt();
	int a[] = new int[x];
	for (int i=0;i<a.length;i++) {
		a[i]=num.nextInt();
	}
	
	for(int k=0;k<a.length;k++) {
		if(k<a.length-1)
			System.out.printf(a[k]+" ");
		else
			System.out.printf(a[k]+"\n");
	}
    
	for(int i=1;i<a.length;i++) {
		key = a[i];
		j = i - 1;
		while (a[j]>key && j>=0) {
			a[j+1]=a[j];
			j--;
			if (j<0) {
				break;
			}
		}
		a[j+1]= key;
		for(int k=0;k<a.length;k++) {
			if(k<a.length-1)
				System.out.printf(a[k]+" ");
			else
				System.out.printf(a[k]+"");
		}
		System.out.println("");
	}
}
}