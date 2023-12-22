import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
	int sumA = 0;
	int sumB = 0;
	for(int i=0; i<4; i++){
	    sumA += kbd.nextInt();
	}
	for(int i=0; i<4; i++){
	    sumB += kbd.nextInt();
	}

	if(sumA>=sumB) System.out.println(sumA);
	else System.out.println(sumB);
    }
}