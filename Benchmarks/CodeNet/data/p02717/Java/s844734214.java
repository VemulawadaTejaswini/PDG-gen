import java.util.Scanner;

 class A {
    public static void main(String[] args) {
        int X,Y,Z,temp;
        Scanner input=new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextInt();
        Z=input.nextInt();

        temp=X;
        X=Z;
        Z=Y;
        Y=temp;
        System.out.println(""+X+" "+Y+" "+Z);
    }
}