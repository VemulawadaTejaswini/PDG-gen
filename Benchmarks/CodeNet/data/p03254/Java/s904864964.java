
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int c=s.nextInt();
        int d=0;
        int a[]= new int[b];
        for (int i = 0; i <b ; i++) {
            a[i]=s.nextInt();
            Arrays.sort(a);

        }
        if(b!=0 || c!=0)
        {
            for (int i = 0; i <b ; i++) {

                if (c > a[i]) {
                    c = c - a[i];
                    d++;
                }
                else{d=0;}


            }
        }
            System.out.println(d);


        }
    }


