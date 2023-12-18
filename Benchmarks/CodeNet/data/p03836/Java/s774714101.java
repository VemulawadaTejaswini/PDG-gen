import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sx = sc.nextInt();
	int sy = sc.nextInt();
	int tx = sc.nextInt();
	int ty = sc.nextInt();

	int xdet = tx-sx;
	int ydet = ty-sy;

	for(int i = 0; i<xdet; i++) {
	    System.out.print("R");
	}
	for(int i = 0; i<ydet; i++) {
            System.out.print("U");
        }

	for(int i = 0; i<xdet; i++) {
            System.out.print("L");
        }
	for(int i = 0; i<ydet; i++) {
            System.out.print("D");
        }

	System.out.print("D");

	for(int i = 0; i<xdet; i++) {
            System.out.print("R");
        }

	System.out.print("R");
	System.out.print("U");

	for(int i = 0; i<ydet; i++) {
            System.out.print("U");
        }

	System.out.print("L");
	System.out.print("U");

	for(int i = 0; i<xdet; i++) {
            System.out.print("L");
        }

	System.out.print("L");
	System.out.print("D");
        for(int i = 0; i<ydet; i++) {
            System.out.print("D");
	}

	System.out.print("R");


    }
}