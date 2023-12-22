import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        int a,l,j,p=0;
        a=tan.nextInt();
        l=tan.nextInt();
        for (int i = 1; i <= a; i++) {
            j=a-i;
            if(i*2+j*4==l){
                p++;
                break;
            }
        }
        if(p==1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
