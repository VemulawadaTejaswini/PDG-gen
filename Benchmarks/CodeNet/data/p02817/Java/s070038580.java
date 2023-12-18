import java.util.Scanner;

class New33
{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);


        String S=new String();
        String T=new String();
//        char[] S=new char[100]
//        System.out.println("enter S");
        S=sc.next();
//        System.out.println("enetr T");
        T=sc.next();

        System.out.println(T.concat(S));
    }
}