import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuffer bs = new StringBuffer();
		
		String str;
		int count = 0;
		while(sc.hasNext()){
			bs.append(sc.next());
			if(bs.equals(bs.reverse()))count++;
			bs.delete(0, bs.length()-1);
			}
		sc.close();
	}
}