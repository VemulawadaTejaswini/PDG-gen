import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
long K= scan.nextLong();
long N=100;
int i=0;
while(N<K){
    double NN=N*1.01;

     N=(int)NN;
    i=i+1;



}

System.out.println(i);

        // write your code here
    }
}
