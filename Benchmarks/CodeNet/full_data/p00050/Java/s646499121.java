import java.io.PrintWriter;
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		while(sc.hasNext()){
			String str = sc.nextLine();
			String s[]=str.split(" ");
			for(int i = 0; i < s.length;i++){
				if(s[i].equals("apple")){
					pw.write("peach"+" ");
					continue;
				}else if(s[i].equals("peach")){
					pw.write("apple"+" ");
					continue;
				}else if(s[i].equals("apple.")){
					pw.write("peach."+" ");
					continue;
				}else if(s[i].equals("peach.")){
					pw.write("apple."+" ");
					continue;
				}else{
					pw.write(s[i]+" ");
					System.out.println(s.length);
					continue;
				}
			}
			pw.println();
		}
	}	
}