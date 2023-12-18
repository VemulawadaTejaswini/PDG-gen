import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            //出力
            System.out.println(Math.min(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())) + Math.min(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
            sc.close();
        }
    }
	