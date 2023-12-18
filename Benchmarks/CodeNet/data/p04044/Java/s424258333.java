import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int L = sc.nextInt();
      	String[] strs = new String [N];
      	for (int i =0; i<L ; i++){
          	String string = sc.nextLine();
        	strs[i] = string;
        }
        Arrays.sort(strs);
        String str = "";
        for (int i =0; i<L ; i++){
        	str += strs[i];
        }
        System.out.println(str);
   		sc.close();
	}
}