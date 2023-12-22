import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
         for (int i=0; i<6; i++) {
            num[i] = sc.nextInt();
        }
        int count = sc.nextInt();
        int a,b,c;
        for (int i=0; i<count; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = 0;
            if(a==num[0]) {
                if (b==num[1]) {
                    c=num[2];
                } else if (b==num[2]) {
                    c=num[4];
                } else if (b==num[4]) {
                    c=num[3];
                } else {
                    c=num[1];
                }
            } else if(a==num[1]) {
                if (b==num[5]) {
                    c=num[2];
                } else if (b==num[2]) {
                    c=num[0];
                } else if (b==num[0]) {
                    c=num[3];
                } else {
                    c=num[5];
                }
            } else if(a==num[2]) {
                if (b==num[5]) {
                    c=num[4];
                } else if (b==num[4]) {
                    c=num[0];
                } else if (b==num[0]) {
                    c=num[1];
                } else {
                    c=num[5];
                } 
            } else if (a==num[3]) {
                if (b==num[1]) {
                    c=num[0];
                } else if (b==num[0]) {
                    c=num[4];
                } else if (b==num[4]) {
                    c=num[5];
                } else {
                    c=num[1];
                } 
            } else if (a==num[4]) {
                if (b==num[2]) {
                    c=num[5];
                } else if (b==num[5]) {
                    c=num[3];
                } else if (b==num[3]) {
                    c=num[0];
                } else {
                    c=num[2];
                }
            } else {
                if (b==num[1]) {
                    c=num[3];
                } else if (b==num[2]) {
                    c=num[1];
                } else if (b==num[4]) {
                    c=num[2];
                } else {
                    c=num[4];
                }
            }
            System.out.println(c);
        }
        
    }
}

