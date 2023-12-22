
import java.util.Scanner;

class Main {
    public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
		
	//数列の長さを最初に、そのあとに数を受け取っていく
	String s1 = sc.next();
        int n = Integer.parseInt(s1);
        int a[] = new int[n];
        for(int i = 0;i < a.length; i++){
            String s2 = sc.next();
            a[i] = Integer.parseInt(s2);
        }
        
        //受け取った順番と逆の順番で出力する
        for(int i = (a.length - 1); i >= 0; i--){
            if(i != 0){
        	System.out.print(a[i] + " ");
            }
            else{
        	System.out.println(a[i]);
            }
        }
    }
}