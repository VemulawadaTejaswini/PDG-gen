import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n1 = Integer.parseInt(sc.next());
            int n2 = Integer.parseInt(sc.next());
            int counter = 0;
            
            for(int i=n1; i<=n2; i++){
            	if(String.valueOf(i).substring(0,1).equals(String.valueOf(i).substring(4,5)) && String.valueOf(i).substring(1,2).equals(String.valueOf(i).substring(3,4))){
            		counter++;
            	}
            }
            
            //出力
            System.out.println(counter);
            sc.close();
        }
    }