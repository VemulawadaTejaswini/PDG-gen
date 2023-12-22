import java.util.Scanner;

class Main{
	public void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = Interger.parseInt(sc.next());
			int result = n * n * n;
			System.out.println(result);
		}
	}
}