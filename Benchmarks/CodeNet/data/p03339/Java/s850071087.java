import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        String[] c = new String[a];
        int min = a;
        for(int i=0; i< a; i++) {
            c[i] = b.substring(i, i+1);
        }
        for(int i=0; i< a; i++) {
            int count =0;
            for(int j=0; j<i; j++) {
                if(c[j].equals("W")) {
                    count++;
                }
            }
            for(int k=i+1; k<a; k++) {
                if(c[k].equals("E")) {
                    count++;
                }
            }
            if(min > count) {
                min = count;

            }
        }
        System.out.println(min);
    }
}