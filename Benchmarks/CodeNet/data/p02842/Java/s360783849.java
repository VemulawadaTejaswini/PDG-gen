import java.io.*;
import java.util.*;
/*import java.io.*;
import java.util.*;
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int price = 0;
        for(int i=1;i<=50000;i++){
            if((int)i*1.08==N){
                price = i;
            }
        }
        if(price>0){
            System.out.println(price);
        }else{
            System.out.println(":(");
        }
    }
}