package aoj0000;

public class Main {

	public void doIt(){
		for(int i=1; i <= 9; i++){
			for(int j=1; j <= 9; j++){
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}