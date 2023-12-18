import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N,M,a,b,c;
N=input.nextInt();

if(100<N || N<999)
{
    a=N%10;
    M=N/10;
    b=M%10;
    c=M/10;
    if(a==7 || b==7 || c==7)
    {
        System.out.println("Yes");
        System.out.println(N+" contains 7 as its last digit.");
    }
    else{
        System.out.println("No");
        System.out.println(N+" does not contain the digit 7.");
    }
}

    }
}