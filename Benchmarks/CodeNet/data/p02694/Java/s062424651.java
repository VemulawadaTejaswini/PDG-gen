import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
int K= scan.nextInt();
int N=100;
int i=0;
while(N<K){
    N=(N*101)/100;
    i=i+1;



}

System.out.println(i);

        // write your code here
    }
}
