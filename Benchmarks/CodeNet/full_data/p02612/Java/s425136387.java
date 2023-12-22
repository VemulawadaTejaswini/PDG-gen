import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
int N=scan.nextInt();
long p=1000-N%1000;
p=p%1000;
System.out.println(p);


}

    }


