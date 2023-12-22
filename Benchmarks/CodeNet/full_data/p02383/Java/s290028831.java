import java.util.Scanner;

class Daice{
	int mas[];
	Daice(int[] mas){
		this.mas = mas;
	}
	
	void north() {
		int temp = mas[4];
		mas[4] = mas[0];
		mas[0] = mas[1];
		mas[1] = mas[5];
		mas[5] = temp;
	}
	
	void south() {
		int temp = mas[0];
		mas[0] = mas[4];
		mas[4] = mas[5];
		mas[5] = mas[1];
		mas[1] = temp;
	}
	
	void east() {
		int temp = mas[0];
		mas[0] = mas[3];
		mas[3] = mas[5];
		mas[5] = mas[2];
		mas[2] = temp;
	}
	
	void west() {
		int temp = mas[0];
		mas[0] = mas[2];
		mas[2] = mas[5];
		mas[5] = mas[3];
		mas[3] = temp;
	}
}

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int m[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};

		Daice d = new Daice(m);
		
		String[] spen = sc.next().split("", 0);
		
		for(int i = 0; i < spen.length; i++) {
			if(spen[i].equals("N")){
				d.north();
			}else if(spen[i].equals("E")) {
				d.east();
			}else if(spen[i].equals("S")) {
				d.south();
			}else {
				d.west();
			}
		}
		System.out.println(d.mas[0]);
	}
}

