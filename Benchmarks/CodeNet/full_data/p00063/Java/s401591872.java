import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
		
		while(sc.hasNext()){
			sb.append(sc.next());
			if(sb.equals(sb.reverse()))count++;
			sb.setLength(0);
		}
		System.out.println(count);
		
		sc.close();
	}
}