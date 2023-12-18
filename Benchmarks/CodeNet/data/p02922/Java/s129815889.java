import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String[] astr = str.split(" "); //状況に合わせて
        int kuti = 0;
        int flag = 0;
        int[] in_data = Stream.of(astr).mapToInt(x->{
            try{
                return Integer.parseInt(x);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return 0;
        }).toArray();
        sc.close();
        int a = in_data[0];
        int b = in_data[1];

        kuti = a;
        flag +=1;
        if(b <= kuti){
            System.out.println("1");
            System.exit(0);
        }

        for(int i=1;i<b;i++){
            kuti = kuti + a ;
            flag += 1;
            if(b <= kuti){
                System.out.println(flag);
                System.exit(0);
            }
            kuti = kuti -1;
        }
    }
}