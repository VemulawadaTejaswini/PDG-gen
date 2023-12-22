import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        if(numA < numB && numB < numC)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}

