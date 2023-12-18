import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
	static String[] Lb;
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
    int N = in.nextInt(); // the number of cells on the Y axis
    int X = in.nextInt(); // the number of cells on the Y axis
    List<String>  lineA= new ArrayList<>();
    List<String>  lineB= new ArrayList<>();
    in.nextLine();
    int count = 0;
    while(count< N){
        lineA.add(in.nextLine());
    count++;
    }
    count =0;
    while(count< X){
        lineB.add(in.nextLine());
    count++;
    }
      System.out.println(recalTo(lineA,lineB));
}
	static int cal (int N,int X){
		int L = 0;
		L = N + X;
		L += (N-X)/X * 2 -X * 2;
		return L;
	}
	//文字列比較
	public static int recal(String A , String B ,int i ,boolean trig){
		if(B.length() + i > A.length()){
			return -1;
		}
		if(A.substring(i, i + B.length()).equals(B)){
			return i;
		}else{
			if(trig){
			return recal(A,B,++i, trig);
			}else{
				return -1;
			}
		}
	}
	
	public static String recalTo(List<String> A , List<String> B){
		int length = 0;
		int index = 0;
		boolean trig = true;
		for(String LA : A){
			String LB  = B.get(index);
			if((length = recal(LA,LB,length, trig)) != -1){
				index++;
				trig = false;
			}else{
				trig = true;
				length = 0;
				index =0;
			}
			if(B.size() == index && length !=-1){
				return "Yas";
			}
		}
		return "No";
	}
}