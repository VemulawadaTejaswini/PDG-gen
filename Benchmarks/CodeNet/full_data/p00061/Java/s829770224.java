
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String point[]= new String[100];
		int rank[]= new int[30];
		int n = 0;
		int count=0;
		while(true){
			String get = sc.next();
			if(get.equals("0,0"))break;
			String str[] = get.split(",");
			point[n = Integer.parseInt(str[0])]=str[1];
			rank[n= Integer.parseInt(str[1])-1]++;
		}
		while(sc.hasNext()){
			count=1;
			n = sc.nextInt();
			for(int i = 29 ;i > Integer.parseInt(point[n]);i--){
				if(rank[i]>0)count++;
			}
			System.out.println(count);
		}
	}	
}