import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc =new Scanner(System.in)){
            int w = sc.nextlnt();
            int n = sc.nextlnt();
            int[] values = new int[w];
            for(int i=0;i<values.length;i++){
                values[i]=i+1;
            }
            for(int i=o;i<n;i++){
                String str=sc.next();
                String[] ab=str.split(regex);
                int a = Integer.parseInt(ab[0]) - 1;
                int b = Integer.parseInt(ab[1]) - 1;
                int value=values[a];
                values[a]=values[b];
                values[b]=values;
            }
            for(int i=0;i<values.length;i++){
                System.out.println(values[i]);
            }
        }
    }
}
