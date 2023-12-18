import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static String[] Lb;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
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
	public static int recal(String A , String B ,int i){
		if(B.length() + i > A.length()){
			return -1;
		}
		if(A.substring(i, i + B.length()).equals(B)){
			return i;
		}else{
			recal(A,B,++i);
			return i;
		}
	}
	public static String recalTo(List<String> A , List<String> B){
		int length = 0;
		int index = 0;
	
		for(String LA : A){
			String LB  = B.get(index);
			if((length = recal(LA,LB,length)) != -1){
				index++;
			}else{
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