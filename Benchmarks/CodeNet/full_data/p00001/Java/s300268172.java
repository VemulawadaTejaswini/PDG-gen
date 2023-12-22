import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] mt = new int[10];
        for(int i = 0; i<10;i++){
            mt[i]=Integer.parseInt(sc.next());
        }
        Arrays.sort(mt);
        for(int i= 0;i<3;i++){
            System.out.println(mt[9-i]);
        }
    }
}