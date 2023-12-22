import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
        int x = Integer.parseInt(sn.next());
        int y = Integer.parseInt(sn.next());
        int[] list = new int[y];
        boolean flg = true;
        if ( y == 0){
            System.out.println(x);
            return;
        }else{
            for(int i =0; i < y ; i++ ){
                list[i] = Integer.parseInt(sn.next());
            }
        }
        for( int i = 0; i <= x ; i++ ){
            int d = x - i;
			for (int b =0; b < y ; b++ ){
                if (list[b] == d){
                    flg = false;
                } 
            }
            if (flg){
                System.out.println(d);
                return;
            }
            flg = true;
            int e = x + i;
			for (int c =0; c < y ; c++ ){
                if (list[c] == e){
                    flg = false;
                } 
            }
            if (flg){
                System.out.println(e);
                return;
            }
            flg = true;
        }
        
	}
}

