import java.util.Scanner;
import java.util.*;
public class Main {
    // void call(int n){
    //   int i = 1;
    //  CHECK_NUM:
    //   int x = i;
    //   if ( x % 3 == 0 ){
    //     cout << " " << i;
    //     goto END_CHECK_NUM;
    //   }
    //  INCLUDE3:
    //   if ( x % 10 == 3 ){
    //     cout << " " << i;
    //     goto END_CHECK_NUM;
    //   }
    //   x /= 10;
    //   if ( x ) goto INCLUDE3;
    //  END_CHECK_NUM:
    //   if ( ++i <= n ) goto CHECK_NUM;

    //   cout << endl;
    // }

    public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	for(;;){
	    String str = sc.nextLine();

	    if(str.equals("-")){
		return;
	    }
	
	    int m = sc.nextInt();
	    for(int i=0; i<m;++i){
		int x = sc.nextInt();
		str = str.substring(x, str.length()) + str.substring(0, x);
	    }
	    System.out.println(str);
	    sc.nextLine();
	}
    }
}