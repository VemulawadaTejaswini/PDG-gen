import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int x,y,z,temp;
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        z=input.nextInt();

        temp=x;
        x=z;
        z=y;
        y=temp;
        System.out.println(""+x+" "+y+" "+z);
    }
}
