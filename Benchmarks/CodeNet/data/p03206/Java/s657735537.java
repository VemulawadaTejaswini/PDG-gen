import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	int d = sc.nextInt();
    	String ans ="";
    	
    	if (d==25)
    	{
    		ans = "Christmas";
    	} else if (d==24){
    		ans = "Christmas Eve";
    	} else if (d==23){
    		ans = "Christmas Eve Eve";
    	} else if (d==22{
    		ans = "Christmas Eve Eve Eve";
    	}
    	// 出力
    	System.out.println(ans);
    }
}