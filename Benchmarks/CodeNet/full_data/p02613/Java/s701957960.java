import java.util.Scanner; 
import java.util.Random; 

class Main {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int n = sc.nextInt();

    for(int i = 0; i<n ; i ++){
        int a = rand.nextInt(4);
        switch (a){
            case 0: System.out.println("AC"); break;
            case 1: System.out.println("WA"); break;
            case 2: System.out.println("TLE"); break;
            case 3: System.out.println("RE"); break;

        }

    }

}

}