import java.util.Scanner;

        class Main{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int m, f, r, i = 0;
	int data[] = new int[100];
	while(true) {
		m = scan.nextInt();
		f = scan.nextInt();
		r = scan.nextInt();
		if(m == -1 && f == -1 && r == -1) break;
		if(m == -1 || f == -1) data[i] = 5;
		else if(m+f >= 80) data[i] = 1;
		else if(m+f >= 65) data[i] = 2;
		else if(m+f >= 50) data[i] = 3;
		else if(m+f >= 30) {
			if(r >= 50) data[i] = 3;
			else data[i] = 4;
		}
		else data[i] = 5;
		i++;
	}
	for(int count = 0; count < i; count++) {
		if(data[count] == 1) System.out.println("A");
		else if(data[count] == 2) System.out.println("B");
		else if(data[count] == 3) System.out.println("C");
		else if(data[count] == 4) System.out.println("D");
		else if(data[count] == 5) System.out.println("F");
	}

	}
}