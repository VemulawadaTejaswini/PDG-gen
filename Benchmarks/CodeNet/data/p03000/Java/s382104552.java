import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int[] l = new int[n];
        int sum = 0;
        int bNum = 1;
        for(int i = 0; i < l.length; i++){
            l[i] = Integer.parseInt(scan.next());
        }
        for(int i : l){
            if(sum + i > x){
                break;
            }
            sum += i;
            bNum++;
        }
        System.out.println(bNum);
    }
}
