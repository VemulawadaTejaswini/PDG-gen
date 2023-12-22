import java.io.IOException;
import java.util.Scanner;

class compRR{
	public compRR() {
		// TODO ?????????????????????????????????????????????????????????
	}

protected Double compR(int r){
	return 2 * Math.PI * r;
	}
protected Double compArea(int r) {
	return Math.pow(r, 2) * Math.PI;
        }
}


public class Main {
	public static void main(String[] args) throws IOException{
	Scanner scanner = new Scanner(System.in);
	int r = scanner.nextInt();
	compRR compRR  = new compRR();
	Double rrDouble = compRR.compR(r);
	Double area = compRR.compArea(r);
	System.out.println(rrDouble + " " + area);
	scanner.close();
	}
}