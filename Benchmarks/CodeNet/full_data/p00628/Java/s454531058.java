import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(true){
			String str=s.nextLine();
			if(str.equals("END OF INPUT"))System.exit(0);
			String []table=str.split(" ");
			for(int i=0;i<table.length;i++){
				System.out.print(table[i].length());
			}
			System.out.println();
		}
	}
}