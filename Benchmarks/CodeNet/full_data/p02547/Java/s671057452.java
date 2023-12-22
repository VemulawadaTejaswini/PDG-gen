
import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int N=scan.nextInt();
int u=0;

for(int i=0;i<N;i++){
    int a=scan.nextInt();
    int b=scan.nextInt();
if(a==b){u++;}
}
if(u>=3)System.out.println("Yes");
else{System.out.println("No");}
    }
}