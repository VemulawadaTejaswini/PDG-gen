import java.util.*;
import java.io.*;
public class Main{

    public static void main(String []args) throws Exception {
        //BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        String [] st = sc.nextLine().split(" ");
        if(m <= 0) {
            System.out.println("Yes");
            
        }else{
        ArrayList<Integer> list = new ArrayList<>();
        int sum =0;
        
        for(String s : st){
            int num = Integer.parseInt(s);
            sum += num;
            list.add(num);
        }
        double ref = sum/(4*m);
        int count = 0;
        boolean c = false;
        for(int i =0 ; i < n ; i++){
            if(list.get(i) >= ref){
                count++;
            }
            if(count == m){
                c = true;
                System.out.println("Yes");
                break;
            }
        }
        if(!c){
            System.out.println("No");
        }
        }
    }
}