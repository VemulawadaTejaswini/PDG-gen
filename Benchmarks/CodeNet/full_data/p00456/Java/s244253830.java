import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]Tokyo=new int[10];
        int[]Kyoto=new int[10];

        for (int i=0;i<Tokyo.length;i++) {
            Tokyo[i] = sc.nextInt();
        }

        for (int i =0;i<Kyoto.length;i++){
            Kyoto[i]=sc.nextInt();
        }
        Arrays.sort(Tokyo);
        int tokyo=Tokyo[9]+Tokyo[8]+Tokyo[7];
        Arrays.sort(Kyoto);
        int kyoto=Kyoto[9]+Kyoto[8]+Kyoto[7];
         System.out.println(tokyo+" "+kyoto);
        }

    }