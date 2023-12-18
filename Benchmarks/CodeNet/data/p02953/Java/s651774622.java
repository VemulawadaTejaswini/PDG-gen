import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>(); 
        for(int i=1; i<=N; i++) {
            list.add(sc.nextInt());
        }
        
        Boolean flag = true;
        Boolean minus = false;
        int onceDesc = -1;
        int left = list.get(0);
        int max = 0;
        for(int i=1; i <N; i++) {
            
            if(list.get(i) > max) {
                max = list.get(i); 
            }
            if(max - list.get(i) > 1) {
                flag = false;
                break;
            }
            if( list.get(i) >= left) {
//                System.out.println(list.get(i));
                left = list.get(i);
            }
            if(list.get(i) < left) {
//                System.out.println("i:"+list.get(i));
//                System.out.println("left:"+left);
                if(left - list.get(i) > 1) {
                    flag = false;
                    break;
                }
                if(left - list.get(i) ==1) {

                    left -= 1;

//                        System.out.println("true");
//                        System.out.println("i:"+list.get(i));
//                        System.out.println("left:"+left);
                    
                }
            }
            
        }
        
        System.out.println(flag? "Yes":"No");
        
    }
}