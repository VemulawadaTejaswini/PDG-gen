import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                int[] a = new int[3];
                Arrays.fill(a , 0);
                for(int i = 0 ; i < 3 ; i++){
                        if(s.charAt(i) == 'R') a[i] = 1;
                }
                if(a[0] == 1 && a[1] == 1 && a[2] == 1){
                        System.out.println(3);
                }else if(a[0] == 1 && a[1] == 1){
                        System.out.println(2);
                }else if(a[1] == 1 && a[2] == 1){
                        System.out.println(2);
                }else if(a[0] == 0 && a[1] == 0 && a[2] == 0){
                        System.out.println(0);
                }else{
                        System.out.println(1);
                }
        }
}