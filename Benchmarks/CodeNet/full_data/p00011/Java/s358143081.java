import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int box[] = new int[30];
        int x=0;       
        int w  = sc.nextInt();
        int n  = sc.nextInt();
        
        for(int i=0;i<w;i++){
            box[i] = i + 1;
        }

        for(int i=0;i<n;i++){
            String str = sc.next();
            String[] ab = str.split(",",0);

            int a = Integer.parseInt(ab[0]) - 1;
            int b = Integer.parseInt(ab[1]) - 1;
            x = box[a];
            box[a] = box[b];
            box[b] = x;
        }

        for(int i=0;i<w;i++){
            System.out.println(box[i]);
        }

        sc.close();
    }
}
