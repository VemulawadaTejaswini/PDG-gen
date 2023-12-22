package chap16;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a;
        int b;

        while(true){
        System.out.print("a:");
        a = scanner.nextInt();
        System.out.print("b:");
        b = scanner.nextInt();

        if(1>a || a>100){
            System.out.println("aは1から100");
            continue;
        }

        if(1>b || b>100){
            System.out.println("bは1から100");
            continue;
        }

        break;

        }


        System.out.print(a*b);

        

        
    }

    
}