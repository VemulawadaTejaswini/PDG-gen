import java.io.PrintWriter;
import java.util.*; 
class Main { 
	static char[] ca;
	static PrintWriter out=new PrintWriter(System.out);
	static boolean judge;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			while(sc.hasNext()){
				judge=true;
				 ca= sc.next().toCharArray();
				 doing('o');
				 if(judge)doing('x');
				 if(judge)out.println('d');
				 out.flush();
			}	
	}
	
	static void doing(char temp){
		if(ca[0]==temp&ca[1]==temp&ca[2]==temp|ca[3]==temp&ca[4]==temp&ca[5]==temp|ca[6]==temp&ca[7]==temp&ca[8]==temp|ca[0]==temp&ca[3]==temp&ca[6]==temp|ca[1]==temp&ca[4]==temp&ca[7]==temp|ca[2]==temp&ca[5]==temp&ca[8]==temp|ca[0]==temp&ca[4]==temp&ca[8]==temp|ca[2]==temp&ca[4]==temp&ca[6]==temp){
			out.println(temp);
			judge=false;
		}
	}
}