import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static String[] Lb;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the number of cells on the Y axis
        in.nextLine();
        String line = in.nextLine(); // width characters, each either 0 or .

        String[] L = line.split(" ");
        Lb = L.clone();
       while(true){
    	   String[] Lc = Lb.clone();
        	recal(0);
        	if(Arrays.equals(Lb, Lc)){
        		break;
        	}
        }
       int out = 0;
       for(int i = 0 ; i <  Lb.length/2; i++){

    	   out +=  Integer.parseInt(Lb[i *2]);
       }
       System.out.println(out);
	}
	//並び替え
	List<Integer> list = new ArrayList<Integer>();
	public static void recal(int i){
		int n= 0,m = 0;
		if(Lb.length -1 > i){
		if((n = Integer.parseInt(Lb[i])) <= (m = Integer.parseInt(Lb[i +1]))){
			recal(i + 1);
		}else{
			Lb[i] = Integer.toString(m);
			Lb[i + 1] = Integer.toString(n);
		}
		}
	}

}
