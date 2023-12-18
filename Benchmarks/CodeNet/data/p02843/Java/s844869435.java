import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int X = Integer.parseInt(sc.next());
        sc.close();

        boolean f = false;
        if (X<100) {
        } else {
            outside : for (int i=0; i<=100000/105; i++) {
                if (X<i*105)
                    break;
            for (int j=0; j<=100000/104; j++) {
                if (X<i*105+j*104)
                    break;
            for (int k=0; k<=100000/103; k++) {
                if (X<i*105+j*104+k*103)
                    break;
            for (int l=0; l<=100000/102; l++) {
                if (X<i*105+j*104+k*103+l*102)
                    break;
            for (int m=0; m<=100000/101; m++) {
                if (X<i*105+j*104+k*103+l*102+m*101)
                    break;
            for (int n=0; n<=100000/100; n++) {
                int Y = i*105+j*104+k*103+l*102+m*101+n*100;
                if (X==Y) {
                    f=true;
                    break outside;
                } else if (X<Y) {
                    break;
                }
            }}}}}}
            if (f) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}